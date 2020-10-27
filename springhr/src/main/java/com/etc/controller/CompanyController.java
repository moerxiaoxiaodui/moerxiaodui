package com.etc.controller;

import com.etc.entity.AllInfo;
import com.etc.entity.Company;
import com.etc.entity.ViewInfo;
import com.etc.service.CompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author huge
 * @date 2020/10/24 - 15:53
 */
@Controller
@CrossOrigin("*") //解决跨域问题
public class CompanyController {
//    @Resource
//    CompanyService companyService;
//    @RequestMapping("findallcompany")
//    public List<Company> findAllCompany(){
//        return companyService.findAllCompany();
//    }
//    @RequestMapping("findcompany")
//    @ResponseBody
//    public List<ViewInfo> findAllCompanyAndHR(){
//        return companyService.findAllCompanyAndHR();
//    }
//    /*
//    * 按照phone查找公司和hr，并分页
//    * */
//    @RequestMapping("findcompanys")
//    @ResponseBody
//    public Page<ViewInfo> findAllCompanys(String phone,@RequestParam(defaultValue = "0") String page,
//                                          @RequestParam(defaultValue = "10") String size) {
//        Pageable pageable = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size));
//        if(phone !=null && phone !=""){
//            return companyService.findAllCompanyAndHR2(phone,pageable);
//        }else{
//            return companyService.findAllCompanys(pageable);
//        }
//    }
//    /*
//    * 查找全部公司、hr和招聘条件,返回List。
//    * */
//    @RequestMapping("findallchr")
//    public ModelAndView findAllCHR(){
//        List<AllInfo> alllist = companyService.findAllCHR();
//        ModelAndView mv=new ModelAndView("HRindex");
//        mv.addObject("alllist",alllist);
//        return mv;
//    }
//
//    @RequestMapping("findallchr2")
//    @ResponseBody
//    public List<AllInfo> findAllCHR2(){
//        List<AllInfo> alllist = companyService.findAllCHR();
//        return alllist;
//    }
//
//    /*@RequestMapping("test")
//    @ResponseBody
//    public String findAllCHR2(HttpSession session){
//        return session.getAttribute("test").toString();
//    }*/
//    @RequestMapping("findchr")
//    public ModelAndView findCHR(HttpSession session){
//        String hrphone = (String)session.getAttribute("hrphone");
//        List<ViewInfo> onelist = companyService.findCompanyAndHRByPhone(hrphone);
//        ModelAndView mv=new ModelAndView("HRindex");
//        mv.addObject("onelist",onelist);
//        return mv;
//    }

}
