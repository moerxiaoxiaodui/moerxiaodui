package com.etc.service.impl;

import com.etc.dao.HRDao;
import com.etc.entity.HR;
import com.etc.service.HRService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HRServiceImpl implements HRService {

    @Resource
     private HRDao hrDao;

    @Override
    public List<HR> findAll() {
        return hrDao.findAll();
    }
}
