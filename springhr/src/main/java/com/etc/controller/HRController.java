package com.etc.controller;

import com.etc.entity.HR;
import com.etc.service.HRService;
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
    //验证注册账号是否已存在
    @RequestMapping("/findHrByPhone/{phone}")
    @ResponseBody
    String findHrByPhone(@PathVariable String phone){
        ModelAndView mv=new ModelAndView();
        HR hr=hrService.findHrByPhone(phone);
        if(hr!=null) {
            mv.addObject("msg","用户已存在");
        }
        return "signin";
    }
    //登录
    @RequestMapping("/findHrByPhoneAndPhone")
    ModelAndView findHrByPhoneAndPhone(String phone,String password,HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        HR hr=hrService.findHrByPhoneAndPassword(phone,password);
        if(hr==null) {
            out.print("error");
        }
        return new ModelAndView("signup","hr",hr);
    }
    @RequestMapping("/hrlogin")
    public String hrlogin(){
        return "signin";
    }
}
