package com.duoduo.dao;

import com.duoduo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User userLogin(User user);
    List<User> AllUser();
    int delUser(int id);
    Integer addUser(User user);
    User userLogins(User user);
}
