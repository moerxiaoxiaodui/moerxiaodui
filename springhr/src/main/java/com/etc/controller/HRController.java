package com.etc.controller;

import com.etc.entity.HR;
import com.etc.service.HRService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

@Controller
@CrossOrigin("*")
public class HRController {

    @Resource
    HRService hrService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<HR> findall(){
        List<HR> list=hrService.findAll();
        return list;
    }
    //验证注册和登录账号是否已存在
    @RequestMapping("/findHrByPhone/{phone}")
    @ResponseBody
    String findHrByPhone(@PathVariable String phone){
        ModelAndView mv=new ModelAndView();
        HR hr=hrService.findHrByPhone(phone);
        if(hr!=null) {
            mv.addObject("msg","用户已存在");
            return "register";
        }
        return "login";
    }
    //登录
    @RequestMapping("/findHrByPhoneAndPhone")
    ModelAndView findHrByPhoneAndPhone(String phone,String password, Model model){
        HR hr=hrService.findHrByPhoneAndPassword(phone,password);
        model.addAttribute(hr);
        return new ModelAndView("signup","hr",model);
    }
    @RequestMapping("/tologin")
    public String toLogin(){
        return "signin";
    }
}
