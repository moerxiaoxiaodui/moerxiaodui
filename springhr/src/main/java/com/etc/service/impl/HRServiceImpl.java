package com.etc.service.impl;

import com.etc.dao.HRDao;
import com.etc.entity.HR;
import com.etc.service.HRService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class HRServiceImpl implements HRService {

    @Resource
     private HRDao hrDao;

    @Override
    public List<HR> findAll() {
        return hrDao.findAll();
    }

    @Override
    public HR findHrByPhone(String phone) {
        return hrDao.findByPhone(phone);
    }


    @Override
    public HR findHrByPhoneAndPassword(String phone, String password) {
        return hrDao.findByphoneAndPassword(phone,password);
    }


}
