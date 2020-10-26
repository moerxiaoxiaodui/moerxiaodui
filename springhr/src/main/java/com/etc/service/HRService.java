package com.etc.service;

import com.etc.entity.HR;

import java.util.List;

public interface HRService {

    public List<HR> findAll();
    //验证HR账号是否存在
    public HR findHrByPhone(String phone);
    //登录
    public HR findHrByPhoneAndPassword(String phone,String password);
    //注册
    public void addHR(HR hr);
    //修改HR
    public void updateHR(HR hr);
}
