package com.duoduo.dao;

import com.duoduo.pojo.Shop;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ShopDao {
    List<Map<String,String>> AllShop();
    Integer delShop(int sid);
    Integer delShopbyuid(int uid);
    List<Map<String,String>> myShop(int uid);
    Shop oneShop(int sid);
    Integer updateShop(Shop shop);
    Integer addShop(Shop shop);
}
