package com.duoduo.service;

import com.duoduo.pojo.Shop;

import java.util.List;
import java.util.Map;

public interface ShopService {
    List<Map<String,String>> AllShop();
    Integer delShop(int sid);
    Integer delShopbyuid(int uid);
    List<Map<String,String>> myShop(int uid);
    Shop oneShop(int sid);
    Integer updateShop(Shop shop);
    Integer addShop(Shop shop);
}
