package com.etc.controller;

import com.etc.entity.Resume;
import com.etc.entity.User;
import com.etc.service.ResumeService;
import com.etc.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

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
    /*
    * 用户注册
    * */
    @RequestMapping("/register/{phone}")
    public User login(@PathVariable String phone){
        User user = userService.findOneUserByPhone(phone);
        if (user!=null){

        }else {

        }
        return userService.findOneUserByPhone(phone);
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
     * 根据phone分页查找全部用户
     * */
    @RequestMapping("/findusersbyphone")
    @ResponseBody
    public Page<User> findAllByPageAndPhone(String phone,@RequestParam(defaultValue = "0") String page,
                                            @RequestParam(defaultValue = "10") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size));
        if (phone != null || phone !=""){
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



}
