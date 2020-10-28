package com.etc.dao;

import com.etc.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/21 - 10:11
 */
public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User>, Serializable {
    @Query("from User where phone = ?1")
    public User findOneUserByPhone(String phone);
    @Query("select u from User u where u.phone like ?1")
    public Page<User> findAllUserByPage(String phone, Pageable pageable);
    @Query("select u from User u")
    public Page<User> findAllByPage(Pageable pageable);
    @Query("select u from User u where u.phone = ?1 and u.password = ?2")
    public User findOneUserByPhoneAndPassword(String phone,String password);
    @Query("delete from User where phone = ?1")
    public void deleteByPhone(String phone);
    @Query("select u from User u where u.id = ?1")
    public User findOneUserByUserId(Integer userid);

}
