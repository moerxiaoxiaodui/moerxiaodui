package com.etc.controller;

import com.etc.entity.Manager;
import com.etc.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/22 - 10:16
 */
@Controller
@RequestMapping("/manager")
@CrossOrigin("*")
public class ManagerController {
    @Resource
    ManagerService managerService;
    @RequestMapping("/login")
    @ResponseBody
    public  String login(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password){
        Manager manager = managerService.Login(account,password);
        if (manager != null){
            System.out.println("登录");
            return "success";
        }else {
            System.out.println("失败");
            return "false";
        }
    }
}
