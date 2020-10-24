package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author huge
 * @date 2020/10/21 - 10:18
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public User findOneUserByPhone(String phone) {
        return userDao.findOneUserByPhone(phone);
    }


    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public Page<User> findAllUserByPage(String phone, Pageable pageable) {
        return userDao.findAllUserByPage("%"+phone+"%",pageable);
    }

    @Override
    public Page<User> findAllByPage(Pageable pageable) {
        return userDao.findAllByPage(pageable);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(User u) {
        userDao.save(u);
    }

    @Override
    public User findOneUser(User user) {
        return userDao.findOneUserByPhoneAndPassword(user.getPhone(),user.getPassword());
    }
}
