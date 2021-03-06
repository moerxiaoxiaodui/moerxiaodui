package com.etc.controller;

import com.etc.entity.HR;
import com.etc.entity.Message;
import com.etc.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MessageController {

    @Resource
    private MessageService messageService;

    //应聘人查看自己面试结果
    @RequestMapping("findById")
//    @ResponseBody
    public ModelAndView findById(int id){
        List<Message> list = messageService.findAllByToId(id);
        ModelAndView mv=new ModelAndView("returnNotice");
        mv.addObject("list",list);
        return mv;
    }

    //添加面试通知信息
    @RequestMapping("tianjia")
    public ModelAndView tianjia(String name){
        System.out.println("name:"+name);
        ModelAndView mv = new ModelAndView("interviewNotice");
        mv.addObject("name",name);
        return mv;
    }

    //保存面试通知信息
    @RequestMapping("saveMessage")
    public ModelAndView saveMessage(Message message, HttpSession session){

//        HR hr = (HR)session.getAttribute("hr");
        HR hr = new HR();
        hr.setId(2);
        message.setHr(hr);
        message.setReadState("0");
        message.setTitle("面试通知");
        System.out.println(message);
        messageService.saveMessage(message);
        ModelAndView mv = new ModelAndView("redirect:findSendResume");
        return mv;
    }

    //标记已读信息
    @RequestMapping("saveState")
    @ResponseBody
    public void saveState(int id){
        System.out.println(messageService.updateMessageReadState(id));
    }

    //查看用户有多少消息
    @RequestMapping("findUserMessageCount")
    @ResponseBody
    public void findUserMessageCount(int id){
        System.out.println(messageService.findUserMessageCount(id));
    }

    //查看用户有多少未读消息
    @RequestMapping("findUserNoReadMessageCount")
    @ResponseBody
    public void findUserNoReadMessageCount(int id){
        System.out.println(messageService.findUserNoReadMessageCount(id));
    }

    //用户删除面试通知
    @RequestMapping("deleteMessage")
    @ResponseBody
    public void deleteMessage(int id){
        messageService.deleteMessage(id);
    }

}
