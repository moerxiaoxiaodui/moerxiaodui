package com.etc.controller;

import com.etc.entity.Recruit;
import com.etc.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huge
 * @date 2020/10/28 - 23:24
 */
@Controller
public class RecuritController {

//    @Resource
//    ManagerFeignClient managerFeignClient;

    @Resource
    private RecruitService recruitService;


    @RequestMapping("/findRecruit")
    public ModelAndView fin(String key){
        List<Recruit> list = recruitService.findRecruitByKey(key);
        ModelAndView mv = new ModelAndView("companies");
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping("findJob")
    @ResponseBody
    public ModelAndView findJob(int id){
        System.out.println("id=");
        Recruit recruit =recruitService.findById(id);
        ModelAndView mv = new ModelAndView("job");
        mv.addObject("recruit",recruit);
        return mv;
    }

}
