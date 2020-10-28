package com.etc.service.impl;

import com.etc.dao.RecruitDao;
import com.etc.entity.Recruit;
import com.etc.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/26 - 15:44
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    RecruitDao recruitDao;
    @Override
    public void addRecruit(Recruit recruit) {
        recruitDao.save(recruit);
    }
}
