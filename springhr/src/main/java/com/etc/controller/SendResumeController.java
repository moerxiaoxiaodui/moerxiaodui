package com.etc.controller;

import com.etc.entity.HR;
import com.etc.entity.SendResume;
import com.etc.service.SendResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SendResumeController {

    @Resource
    private SendResumeService sendResumeService;

    @RequestMapping("findSendResume")
    public ModelAndView findSendResume(HttpSession session){
        HR hr = (HR) session.getAttribute("hr");
        ModelAndView mv = new ModelAndView("messages");
        List<SendResume> list = sendResumeService.findAllByHr_Id(hr.getId());
        mv.addObject("list",list);
        return mv;
    }



}
