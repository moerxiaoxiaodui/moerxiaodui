package com.etc.service;

import com.etc.entity.Recruit;

import java.util.List;

/**
 * @author huge
 * @date 2020/10/26 - 15:44
 */
public interface RecruitService {
    public void addRecruit(Recruit recruit);

    public List<Recruit> findRecruitByKey(String key);

    public Recruit findById(int id);
}
