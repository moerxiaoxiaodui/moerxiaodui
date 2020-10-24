package com.etc.service;

import com.etc.entity.Manager;

/**
 * @author huge
 * @date 2020/10/22 - 10:15
 */
public interface ManagerService {
    public Manager Login(String account,String password);
}
