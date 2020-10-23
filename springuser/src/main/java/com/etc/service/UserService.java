package com.etc.service;

import com.etc.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author huge
 * @date 2020/10/21 - 10:17
 */
public interface UserService {
    //通过手机号码查询单个用户
    public User findOneUserByPhone(String phone);
    //查找全部用户
    public List<User> findAllUser();
    //
    public Page<User> findAllUserByPage(String phone, Pageable pageable);
    //分页查找全部用户
    public Page<User> findAllByPage(Pageable pageable);
}
