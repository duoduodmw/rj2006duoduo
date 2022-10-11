package com.duoduo.service.impl;

import com.duoduo.dao.AdminDao;
import com.duoduo.pojo.Admin;
import com.duoduo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin AdminLogin(Admin admin) {
        return adminDao.adminLogin(admin);
    }
}
