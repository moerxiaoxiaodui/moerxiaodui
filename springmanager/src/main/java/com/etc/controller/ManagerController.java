package com.etc.controller;

import com.etc.entity.Manager;
import com.etc.entity.User;
import com.etc.feigninters.ManagerFeignClient;
import com.etc.service.ManagerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    ManagerFeignClient managerFeignClient;
    /*
    * 管理员登录
    * */
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
    /*
    * 查找所有用户
    * */
    @RequestMapping("/findalluser")
    @ResponseBody
    public List<User> findAllUser(){
        return managerFeignClient.findAllUser();
    }
    /*
    *
    * */
    @RequestMapping("/findusers")  //error
    @ResponseBody
    public Page<User> findAllByPage(@RequestParam(defaultValue = "0") String page,@RequestParam(defaultValue = "10") String size){
        return managerFeignClient.findAllByPage(page,size);
    }
}
