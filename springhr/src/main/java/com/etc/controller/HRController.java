package com.etc.controller;

import com.etc.entity.HR;
import com.etc.entity.Recruit;
import com.etc.service.HRService;
import com.etc.service.RecruitService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin("*")
public class HRController {

    @Resource
    HRService hrService;
    @Resource
    RecruitService recruitService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<HR> findall(){
        List<HR> list=hrService.findAll();
        return list;
    }
    //验证注册账号是否已存在
    @RequestMapping("/findHrByPhone")
    @ResponseBody
    Map findHrByPhone(@PathVariable String phone){
        Map<String,Object> map=new HashMap<>();
        HR hr=hrService.findHrByPhone(phone);
        if(hr!=null) {
            map.put("msg","success");
            return map;
        }
        return null;
    }
    @RequestMapping("/register")
    String register(HR hr){
        hrService.addHR(hr);
        return "signin";
    }
    //登录
    @RequestMapping("/findHrByPhoneAndPassword")
    @ResponseBody
    Map findHrByPhoneAndPhone(String phone, String password) {
        Map<String,Object> map=new HashMap<>();
        HR hr=hrService.findHrByPhoneAndPassword(phone,password);
        System.out.println(hr);
        if(hr==null) {
            map.put("msg","error");
            return map;
        }
        return null;
    }
    //hr登录test。
    @RequestMapping("/hrtestlogin")
    public String toHRIndex(@RequestParam(name = "phone") String phone,@RequestParam(name = "password") String password
            ,HttpSession session) {
        HR hr=hrService.findHrByPhoneAndPassword(phone,password);
        if(hr!=null){
            session.setAttribute("hrphone",phone);
            HR hr2=hrService.findHrByPhone(phone);
            session.setAttribute("hrid",hr2.getId());
            return "redirect:/findchr";
        }else {
            return "redirect:/hrlogin";
        }
    }

    @RequestMapping("/hrlogin")
    public String hrlogin(){
        return "signin";
    }
    @RequestMapping("/hrregister")
    public String hrregister(){
        return "signup";
    }
    @RequestMapping("/hrindex")
    public String HRIndex(){
        return "HRindex";
    }
    /*
    * 发布职位
    * */
    @RequestMapping("/addrecruit")
    public String addOneRecruit(Recruit recruit,HttpSession session){
        Integer hrid = (Integer)session.getAttribute("hrid");
        recruit.setHrId(hrid);
        recruitService.addOneRecruit(recruit);
        return "redirect:/addjob";
    }
    /*
    * 跳转到add-project.html
    * */
    @RequestMapping("/addjob")
    public String addJob(){
        return "add-project";
    }


}
