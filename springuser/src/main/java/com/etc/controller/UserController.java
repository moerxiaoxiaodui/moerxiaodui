package com.etc.controller;

import com.etc.entity.Company;
import com.etc.entity.Resume;
import com.etc.entity.User;
import com.etc.feigninters.HRFeignClient;
import com.etc.service.ResumeService;
import com.etc.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huge
 * @date 2020/10/21 - 10:22
 */
@Controller
/*@RequestMapping("/user")*/
@CrossOrigin("*") //解决跨域问题
public class UserController {
    @Resource
    UserService userService;
    @Resource
    ResumeService resumeService;
    @Resource
    HRFeignClient hrFeignClient;
    /*
    * 用户注册
    * */
    @RequestMapping("/findUserByPhone")
    @ResponseBody
    public Map register(String phone){
        Map<String,Object> map =new HashMap<>();
        User user=userService.findOneUserByPhone(phone);
        if (user!=null){
            map.put("msg","success");
        }
        return null;
    }
    @RequestMapping("/register")
    String register(User u){
        System.out.println(u);
        userService.addUser(u);
        return "signin";
    }
    /*
    * 用户添加简历
    * */
    @RequestMapping("/resume")
    public void addResume(){
        Resume resume = new Resume();
        resume.setId(1);
        resume.setName("dawa");
        resume.setUserId("1");
        System.out.println(resume);
        resumeService.saveUserResume(resume);
    }
    /*
    * 查找全部用户
    * */
    @RequestMapping("/findalluser")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
    /*
     * 分页查找全部用户
     * */
    @RequestMapping("/findusers")
    @ResponseBody
    public Page<User> findAllByPage(@RequestParam(defaultValue = "0") String page,@RequestParam(defaultValue = "10") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size));
        return userService.findAllByPage(pageable);
    }
    /*
    不用分页查找
     */

    /*
     * 根据phone分页查找全部用户
     * */
    @RequestMapping("/findusersbyphone")
    @ResponseBody
    public Page<User> findAllByPageAndPhone(String phone,@RequestParam(defaultValue = "0") String page,
                                            @RequestParam(defaultValue = "10") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size));
        if (phone != null && phone !=""){
            return userService.findAllUserByPage(phone,pageable);
        }else{
            return userService.findAllByPage(pageable);
        }
    }
    /*
    * 去登录
    * */
    @RequestMapping("/tologin")
    public String toLogin(){
        return "signin";
    }
    @RequestMapping("/login")
    public String Login(User user,Model model){
        if(userService.findOneUser(user)!=null){
            List<Company> companyList=hrFeignClient.findAllCompany();
            User u=userService.findOneUser(user);
            model.addAttribute("user",u);
            model.addAttribute("listCompany",companyList);
            return "redirect:/index";
        }else{
            return "redirect:/tologin";
        }
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test(HttpSession session) {
      session.setAttribute("test","hongjiahua");
      return "11111";
    }
    @RequestMapping("/toregister")
    String register(){
        return "signup";
    }



}
