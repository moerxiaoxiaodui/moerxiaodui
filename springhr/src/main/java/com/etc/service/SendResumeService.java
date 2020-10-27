package com.etc.service;

import com.etc.entity.SendResume;

import java.util.List;

public interface SendResumeService {

    public List<SendResume> findAllByHr_Id(int id);


}
