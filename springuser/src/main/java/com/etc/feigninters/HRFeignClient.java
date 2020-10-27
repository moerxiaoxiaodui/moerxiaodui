package com.etc.feigninters;

import com.etc.entity.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "springhr")
public interface HRFeignClient {
@RequestMapping("/findallcompany")
    List<Company> findAllCompany();
}
