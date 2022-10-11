package com.duoduo.dao;

import com.duoduo.pojo.Good;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GoodDao {
    List<Map<String,String>> AllGood();
    Integer delGood(int gid);
    Integer delGoodbysid(int sid);
    List<Map<String,String>> ShopGood(int sid);
    Integer addGood(Good good);
    Integer updateGood(Good good);
}
