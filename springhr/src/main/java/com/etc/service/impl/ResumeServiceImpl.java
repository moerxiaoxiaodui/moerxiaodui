package com.etc.service.impl;

import com.etc.dao.ResumeDao;
import com.etc.entity.Resume;
import com.etc.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/21 - 17:03
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    ResumeDao resumeDao;
    @Override
    public void saveUserResume(Resume resume) {
        resumeDao.save(resume);
    }

    //根据id查找简历
    @Override
    public Resume findById(int id) {
        return resumeDao.findById(id);
    }
}
