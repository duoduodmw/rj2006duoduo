package com.duoduo.controller;

import com.alibaba.fastjson.JSON;
import com.duoduo.pojo.Good;
import com.duoduo.pojo.Shop;
import com.duoduo.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class goodcontroller {
    @Autowired
    private GoodService goodService;

    @GetMapping("/getAllGood")
    public String AllGood(){
        List<Map<String,String>> goods=goodService.AllGood();
        return JSON.toJSONString(goods);
    }
    @GetMapping("/getoneGood")
    public String oneGood(int sid){
        List<Map<String,String>> onegood=goodService.ShopGood(sid);
        return JSON.toJSONString(onegood);
    }
    @GetMapping("/delGood")
    public ResponseEntity<Integer> delGood(int gid){
        return  ResponseEntity.ok(goodService.delGood(gid));
    }
    @GetMapping("/delGoodbysid")
    public ResponseEntity<Integer> delGoodbysid(int sid){
        return  ResponseEntity.ok(goodService.delGoodbysid(sid));
    }
    @GetMapping("addGood")
    public ResponseEntity<Integer> addGood(Good good){
        return  ResponseEntity.ok(goodService.addGood(good));
    }
    @GetMapping("/updateGood")
    public ResponseEntity<Integer> updateGood(Good good){
        return  ResponseEntity.ok(goodService.updateGood(good));
    }
}
