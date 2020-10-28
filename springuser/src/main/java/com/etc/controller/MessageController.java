package com.etc.controller;

import com.etc.entity.Message;
import com.etc.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class MessageController {

    @Resource
    private MessageService messageService;

    @RequestMapping("findMessageByid/{id}")
    public ModelAndView findMessageByid(@PathVariable Integer id){
        System.out.println("2333");
        ModelAndView mv = new ModelAndView("interviewNotice");
        Message message = messageService.findById(id);
        mv.addObject("message",message);
        return mv;
    }

}
