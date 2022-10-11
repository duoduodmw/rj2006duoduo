package com.duoduo.dao;

import com.duoduo.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    Admin adminLogin(Admin admin);
}
