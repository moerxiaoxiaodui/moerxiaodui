package com.etc.service.impl;

import com.etc.dao.SendResumeDao;
import com.etc.entity.SendResume;
import com.etc.service.SendResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SendResumeServiceImpl implements SendResumeService {

    @Resource
    public SendResumeDao sendResumeDao;

    @Override
    public List<SendResume> findAllByHr_Id(int id) {
        return sendResumeDao.findAllByHr_Id(id);
    }
}
