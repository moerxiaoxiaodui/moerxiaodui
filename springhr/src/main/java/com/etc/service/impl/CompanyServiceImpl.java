package com.etc.service.impl;

import com.etc.dao.CompanyDao;
import com.etc.entity.AllInfo;
import com.etc.entity.Company;
import com.etc.entity.ViewInfo;
import com.etc.service.CompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Resource
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

    @Override
    public List<ViewInfo> findAllCompanyAndHR() {
        return companyDao.findAllCompanyAndHR();
    }

    @Override
    public Page<ViewInfo> findAllCompanyAndHR2(String phone, Pageable pageable) {
        return companyDao.findAllCompanyAndHR2("%"+phone+"%",pageable);
    }

    @Override
    public Page<ViewInfo> findAllCompanys(Pageable pageable) {
        return companyDao.findAllCompanys(pageable);
    }

    @Override
    public List<AllInfo> findAllCHR() {
        return companyDao.findAllCHR();
    }

    @Override
    public List<AllInfo> findCHR(String phone) {
        return companyDao.findCHR(phone);
    }

}
