package com.etc.controller;

import com.etc.entity.*;
import com.etc.service.RecruitService;
import com.etc.service.ResumeService;
import com.etc.service.SendResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author huge
 * @date 2020/10/24 - 9:51
 */
@Controller
@RequestMapping("/sendresume")
public class SendResumeController {

    @Resource
    private SendResumeService sendResumeService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private ResumeService resumeService;

    @RequestMapping("/addSendResume")
    public ModelAndView addSendResume(int id, HttpSession session){
        Recruit recruit = recruitService.findById(id);
        SendResume sendResume = new SendResume();
        sendResume.setJob(recruit.getJob());
        User user = (User) session.getAttribute("user");
        Resume resume = resumeService.findByUserId(user.getId());
        sendResume.setResume(resume);
        sendResume.setHr(recruit.getHr());
        sendResumeService.addSendResume(sendResume);
        ModelAndView mv = new ModelAndView("redirect:findRecruit");
        return mv;
    }
}
