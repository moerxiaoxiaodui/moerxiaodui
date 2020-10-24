package com.etc.dao;

import com.etc.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/22 - 10:14
 */
public interface ManagerDao extends JpaRepository<Manager,Integer>, JpaSpecificationExecutor<ManagerDao>, Serializable {
    @Query("from Manager where account = ?1 and password = ?2")
    public Manager findManagerByAccountAndPassword(String account,String password);
}
