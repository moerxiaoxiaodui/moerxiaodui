package com.etc.dao;

import com.etc.entity.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface HRDao extends JpaRepository<HR,Integer>, JpaSpecificationExecutor<HR>, Serializable {
    @Query("select h from HR h where h.phone= ?1")
    HR findByPhone(String phone);
    @Query("select h from HR h where h.phone=?1 and h.password=?2")
    HR findByphoneAndPassword(String phone,String password);
}
