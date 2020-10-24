package com.etc.service;

import com.etc.entity.HR;

import java.util.List;

public interface HRService {

    public List<HR> findAll();
    public HR findHrByPhone(String phone);
    public HR findHrByPhoneAndPassword(String phone,String password);
}
