package com.etc.service;

import com.etc.entity.Resume;
import com.etc.entity.SendResume;

/**
 * @author huge
 * @date 2020/10/24 - 9:48
 */
public interface SendResumeService {
    //发送简历
    public void addSendResume(SendResume sendResume);

}
