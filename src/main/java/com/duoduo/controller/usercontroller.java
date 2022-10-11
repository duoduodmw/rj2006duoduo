package com.duoduo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.duoduo.pojo.User;
import com.duoduo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
public class usercontroller {
    @Autowired
    private UserService userService;
    @GetMapping("/userLogin")
    public String userLogin(User user){
        User us=userService.userLogin(user);
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("code", 200);
        hashMap.put("uid",us.getUID());
        JSONObject jsonObject=new JSONObject(hashMap);
        Map<String,Object> map = (Map<String,Object>)jsonObject;
        if (us!=null){
            return JSON.toJSONString(map);
        }
        return JSON.toJSONString(map);
    }
    @GetMapping("/getAllUser")
    public List<User> AllUser(){
        List<User> users=userService.AllUser();
        return users;
    }
    @GetMapping("/delUser")
    public ResponseEntity<Integer> delUser(int id){
        return  ResponseEntity.ok(userService.delUser(id));
    }
    @GetMapping("/addUser")
    public ResponseEntity<Integer> addUser(User user){
        return  ResponseEntity.ok(userService.addUser(user));
    }
    @GetMapping("/userLogins")
    public String userLogins(User user){
        User us=userService.userLogins(user);
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("code", 200);
        hashMap.put("uid",us.getUID());
        hashMap.put("uname",us.getUName());
        hashMap.put("uphone",us.getUPhone());
        if (us.getUAddress()==null||us.getUAddress()=="")
        {
            hashMap.put("uaddress","未填");
        }
        JSONObject jsonObject=new JSONObject(hashMap);
        Map<String,Object> map = (Map<String,Object>)jsonObject;
        if (us!=null){
            return JSON.toJSONString(map);
        }
        return JSON.toJSONString(map);
    }
}
