package com.etc.dao;

import com.etc.entity.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface HRDao extends JpaRepository<HR,Integer>, JpaSpecificationExecutor<HR>, Serializable {
}
