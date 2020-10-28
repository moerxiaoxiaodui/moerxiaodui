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

    @RequestMapping("hrLogin")
    public ModelAndView hrLogin(String phone,String password,HttpSession session){
        System.out.println("23333");
        HR hr = hrService.findByPhoneAndPassword(phone,password);
        if(hr!=null){
            session.setAttribute("hr",hr);
            ModelAndView mv = new ModelAndView("HRindex");
            mv.addObject("hr",hr);
            return mv;
        }else{
            ModelAndView mv = new ModelAndView("signin");
            return mv;
        }
    }

    @RequestMapping("toAddProkect")
    public ModelAndView toAddProkect(){
        ModelAndView mv = new ModelAndView("add-project");
        return mv;
    }

    @RequestMapping("toMessages")
    public ModelAndView toMessages(){
        ModelAndView mv = new ModelAndView("redirect:findSendResume");
        return mv;
    }

    @RequestMapping("toHRindex")
    public ModelAndView toHRindex(HttpSession session){

        HR hr = (HR) session.getAttribute("hr");
        ModelAndView mv = new ModelAndView("HRindex");
        mv.addObject("hr",hr);
        return mv;
    }


}
