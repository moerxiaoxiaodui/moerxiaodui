package com.etc.service;

import com.etc.entity.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> findAllCompany();
    public Company findOneById(Integer id);
}
