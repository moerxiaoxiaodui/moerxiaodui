package com.etc.dao;

import com.etc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/21 - 10:11
 */
public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User>, Serializable {
}
