package com.etc.dao;

import com.etc.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/21 - 16:59
 */
public interface ResumeDao extends JpaRepository<Resume,Integer>, JpaSpecificationExecutor<Resume>, Serializable {
    
}
