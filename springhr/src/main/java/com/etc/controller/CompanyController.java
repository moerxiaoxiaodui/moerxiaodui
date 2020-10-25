package com.etc.controller;

import com.etc.entity.Company;
import com.etc.entity.ViewInfo;
import com.etc.service.CompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huge
 * @date 2020/10/24 - 15:53
 */
@RestController
@CrossOrigin("*") //解决跨域问题
public class CompanyController {
    @Resource
    CompanyService companyService;
    @RequestMapping("findallcompany")
    public List<Company> findAllCompany(){
        return companyService.findAllCompany();
    }
    @RequestMapping("findcompany")
    @ResponseBody
    public List<ViewInfo> findAllCompanyAndHR(){
        return companyService.findAllCompanyAndHR();
    }
    /*
    * 按照phone查找公司和hr，并分页
    * */
    @RequestMapping("findcompanys")
    @ResponseBody
    public Page<ViewInfo> findAllCompanys(String phone,@RequestParam(defaultValue = "0") String page,
                                          @RequestParam(defaultValue = "10") String size) {
        Pageable pageable = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size));
        if(phone !=null && phone !=""){
            return companyService.findAllCompanyAndHR2(phone,pageable);
        }else{
            return companyService.findAllCompanys(pageable);
        }
    }

}
