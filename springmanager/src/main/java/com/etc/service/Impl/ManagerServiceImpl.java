package com.etc.service.Impl;

import com.etc.dao.ManagerDao;
import com.etc.entity.Manager;
import com.etc.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huge
 * @date 2020/10/22 - 10:15
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    ManagerDao managerDao;
    @Override
    public Manager Login(String account, String password) {
        return managerDao.findManagerByAccountAndPassword(account,password);
    }
}
