package com.duoduo.service;

import com.duoduo.pojo.User;

import java.util.List;

public interface UserService {
    User userLogin(User user);
    List<User> AllUser();
    int delUser(int id);
    Integer addUser(User user);
    User userLogins(User user);
}
