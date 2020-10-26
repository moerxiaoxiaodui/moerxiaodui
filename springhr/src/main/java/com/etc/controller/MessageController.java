package com.etc.controller;

import com.etc.entity.Message;
import com.etc.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MessageController {

    @Resource
    private MessageService messageService;

    //应聘人查看自己面试结果
    @RequestMapping("findById")
    @ResponseBody
    public List<Message> findById(int id){
        List<Message> list = messageService.findAllByToId(id);
        System.out.println(list);
        return list;
    }

    //添加面试通知信息
    @RequestMapping("saveMessage")
    @ResponseBody
    public void saveMessage(Message message){
        message.setReadState("0");
        messageService.saveMessage(message);
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
