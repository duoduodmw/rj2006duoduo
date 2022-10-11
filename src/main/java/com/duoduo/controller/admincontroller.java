package com.duoduo.controller;

import com.duoduo.pojo.Admin;
import com.duoduo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


@RestController
@CrossOrigin
public class admincontroller {
    @Autowired
    private AdminService adminService;


    @GetMapping ("/AdminLogin")
    public Integer adminlogin(Admin admin){
        Admin user=adminService.AdminLogin(admin);
        if (user!=null){
            return  200;
        }
        return  400;
    }
}
