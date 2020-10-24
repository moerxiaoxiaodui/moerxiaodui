package com.etc.controller;

import com.etc.entity.SendResume;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huge
 * @date 2020/10/24 - 9:51
 */
@Controller
@RequestMapping("/sendresume")
public class SendResumeController {
    @RequestMapping("/add")
    public void addSendResume(SendResume sendResume){

    }
}
