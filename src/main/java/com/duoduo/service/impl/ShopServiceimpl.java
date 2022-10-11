package com.duoduo.service.impl;

import com.duoduo.dao.ShopDao;
import com.duoduo.pojo.Shop;
import com.duoduo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceimpl  implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Map<String,String>> AllShop() {
        return shopDao.AllShop();
    }

    @Override
    public Integer delShop(int sid) {
        return shopDao.delShop(sid);
    }

    @Override
    public Integer delShopbyuid(int uid) {
        return shopDao.delShopbyuid(uid);
    }

    @Override
    public List<Map<String,String>> myShop(int uid) {
        return shopDao.myShop(uid);
    }

    @Override
    public Shop oneShop(int sid) {
        return shopDao.oneShop(sid);
    }

    @Override
    public Integer updateShop(Shop shop) {
        return shopDao.updateShop(shop);
    }

    @Override
    public Integer addShop(Shop shop) {
        return shopDao.addShop(shop);
    }
}
