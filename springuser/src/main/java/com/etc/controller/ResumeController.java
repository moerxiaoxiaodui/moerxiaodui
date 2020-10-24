package com.etc.controller;

import com.etc.entity.Resume;
import com.etc.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @RequestMapping("/myresume")
    public ModelAndView resume(){
        ModelAndView mv= new ModelAndView("profile");
        return mv;
    }

    @RequestMapping("/saveresume")
    public ModelAndView saveresume(Resume resume) {
        System.out.println(resume);
        ModelAndView mv=new ModelAndView("resume");
        resumeService.saveUserResume(resume);
        mv.addObject("resume",resume);
        return mv;
    }
}
