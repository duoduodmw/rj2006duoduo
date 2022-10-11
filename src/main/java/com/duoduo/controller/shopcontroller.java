package com.duoduo.controller;

import com.alibaba.fastjson.JSON;
import com.duoduo.pojo.Good;
import com.duoduo.pojo.Shop;
import com.duoduo.pojo.User;
import com.duoduo.service.ShopService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class shopcontroller {
    @Autowired
    private ShopService shopService;

    @GetMapping("/getAllShop")
    public String AllShop(){
        List<Map<String,String>> shops=shopService.AllShop();
        return JSON.toJSONString(shops);
    }
    @GetMapping("/getmyShop")
    public String getmyShop(int uid){
        List<Map<String,String>> shops=shopService.myShop(uid);
        return JSON.toJSONString(shops);
    }
    @GetMapping("/oneShop")
    public Shop getoneShop(int sid){
        Shop oneshop=shopService.oneShop(sid);
        return oneshop;
    }
    @GetMapping("/delShop")
    public ResponseEntity<Integer> delShop(int sid){
        return  ResponseEntity.ok(shopService.delShop(sid));
    }
    @GetMapping("/delShopbyuid")
    public ResponseEntity<Integer> delShopbyuid(int uid){
        return  ResponseEntity.ok(shopService.delShopbyuid(uid));
    }
    @GetMapping("/updateShop")
    public ResponseEntity<Integer> updateShop(Shop shop){
        return  ResponseEntity.ok(shopService.updateShop(shop));
    }
    @GetMapping("addShop")
    public ResponseEntity<Integer> addShop(Shop shop){
        return  ResponseEntity.ok(shopService.addShop(shop));
    }
}
