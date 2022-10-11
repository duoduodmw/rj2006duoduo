package com.duoduo.service.impl;

import com.duoduo.dao.UserDao;
import com.duoduo.pojo.User;
import com.duoduo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User userLogin(User user) {
        return userDao.userLogin(user);
    }

    @Override
    public List<User> AllUser() {
        return userDao.AllUser();
    }

    @Override
    public int delUser(int id) {
        return userDao.delUser(id);
    }

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User userLogins(User user) {
        return userDao.userLogins(user);
    }
}
