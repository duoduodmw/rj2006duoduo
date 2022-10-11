package com.duoduo.service;

import com.duoduo.pojo.Good;

import java.util.List;
import java.util.Map;

public interface GoodService {
    List<Map<String,String>> AllGood();
    Integer delGood(int gid);
    Integer delGoodbysid(int sid);
    List<Map<String,String>> ShopGood(int sid);
    Integer addGood(Good good);
    Integer updateGood(Good good);
}
