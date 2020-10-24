package com.etc.dao;

import com.etc.entity.SendResume;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

public interface SendResumeDao extends JpaRepository<SendResume,Integer>, JpaSpecificationExecutor<SendResume>, Serializable {
    @Query("select s from SendResume s")
    public Page<SendResume> findAllResumeByPage(int id, Pageable pageable);
}
