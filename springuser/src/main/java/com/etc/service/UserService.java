package com.etc.service;

import com.etc.entity.User;

/**
 * @author huge
 * @date 2020/10/21 - 10:17
 */
public interface UserService {
    //通过手机号码查询单个用户
    public User findOneUserByPhone(String phone);
}
