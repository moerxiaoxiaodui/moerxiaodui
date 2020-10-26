package com.etc.dao;

import com.etc.entity.HR;
import com.etc.entity.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/26 - 15:39
 */
public interface RecruitDao extends JpaRepository<Recruit,Integer>, JpaSpecificationExecutor<Recruit>, Serializable {

}
