package com.etc.controller;

import com.etc.entity.SendResume;
import com.etc.service.SendResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SendResumeController {

    @Resource
    private SendResumeService sendResumeService;

    @RequestMapping("findSendResume")
    @ResponseBody
    public List<SendResume> findSendResume(int id){
        List<SendResume> list = sendResumeService.findAllByHr_Id(id);
        System.out.println(list);
        return list;
    }

}
