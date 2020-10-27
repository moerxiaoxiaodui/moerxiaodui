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
    //删除用户
    public void deleteUserById(int id);
    //修改用户
    public void updateUser(User u);
    //通过phone和password查找用户
    public User findOneUser(User user);
    //增加用户
    void addUser(User user);

}
