package com.etc.service;

import com.etc.entity.Resume;

/**
 * @author huge
 * @date 2020/10/21 - 17:03
 */
public interface ResumeService {
    //用户添加简历
    public void saveUserResume(Resume resume);

    //根据id查找简历
    public Resume findById(int id);
}
