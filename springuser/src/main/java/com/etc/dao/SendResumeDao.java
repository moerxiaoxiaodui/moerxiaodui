package com.etc.dao;

import com.etc.entity.SendResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/24 - 9:46
 */
public interface SendResumeDao extends JpaRepository<SendResume,Integer>, JpaSpecificationExecutor<SendResume>, Serializable {
}
