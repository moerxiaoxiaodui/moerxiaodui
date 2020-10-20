package com.etc.controller;

import com.etc.entity.HR;
import com.etc.service.HRService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HRController {

    @Resource
    HRService hrService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<HR> findall(){
        List<HR> list=hrService.findAll();
        return list;
    }
}
