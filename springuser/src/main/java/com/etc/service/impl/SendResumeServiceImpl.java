package com.etc.service.impl;

import com.etc.dao.SendResumeDao;
import com.etc.entity.SendResume;
import com.etc.service.SendResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/24 - 9:48
 */
@Service
public class SendResumeServiceImpl implements SendResumeService {
    @Resource
    SendResumeDao sendResumeDao;
    @Override
    public void addSendResume(SendResume sendResume) {
        sendResumeDao.save(sendResume);
    }
}
