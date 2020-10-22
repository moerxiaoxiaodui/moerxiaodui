package com.etc.controller;

import com.etc.entity.Resume;
import com.etc.entity.User;
import com.etc.service.ResumeService;
import com.etc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/21 - 10:22
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    ResumeService resumeService;
    /*
    * 用户注册
    * */
    @RequestMapping("/register/{phone}")
    public User login(@PathVariable String phone){
        User user = userService.findOneUserByPhone(phone);
        if (user!=null){

        }else {

        }
        return userService.findOneUserByPhone(phone);
    }
    /*
    * 用户添加简历
    * */
    @RequestMapping("/resume")
    public void addResume(){
        Resume resume = new Resume();
        resume.setId(1);
        resume.setName("dawa");
        resume.setUserId("1");
        System.out.println(resume);
        resumeService.saveUserResume(resume);
    }

}
