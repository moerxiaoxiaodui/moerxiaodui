package com.etc.controller;

import com.etc.entity.HR;
import com.etc.entity.Recruit;
import com.etc.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class RecruitController {

    @Resource
    private RecruitService recruitService;

    @RequestMapping("addRecruit")
    public ModelAndView addRecruit(Recruit recruit, HttpSession session){
        HR hr = (HR)session.getAttribute("hr");
        recruit.setHr(hr);
        recruitService.addRecruit(recruit);
        ModelAndView mv = new ModelAndView("redirect:toHRindex");
        return mv;
    }

}
