package com.etc.service.impl;

import com.etc.dao.CompanyDao;
import com.etc.entity.Company;
import com.etc.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyDao companyDao;
    @Override
    public List<Company> findAllCompany() {
        return companyDao.findAll();
    }

    @Override
    public Company findOneById(Integer id) {
        Optional<Company> optional=companyDao.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
