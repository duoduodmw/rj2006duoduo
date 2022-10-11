package com.duoduo.service.impl;

import com.duoduo.dao.GoodDao;
import com.duoduo.pojo.Good;
import com.duoduo.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodServiceimpl implements GoodService {
    @Autowired
    private GoodDao goodDao;
    @Override
    public List<Map<String, String>> AllGood() {
        return goodDao.AllGood();
    }

    @Override
    public Integer delGood(int gid) {
        return goodDao.delGood(gid);
    }

    @Override
    public Integer delGoodbysid(int sid) {
        return goodDao.delGoodbysid(sid);
    }

    @Override
    public List<Map<String, String>> ShopGood(int sid) {
        return goodDao.ShopGood(sid);
    }

    @Override
    public Integer addGood(Good good) {
        return goodDao.addGood(good);
    }

    @Override
    public Integer updateGood(Good good) {
        return goodDao.updateGood(good);
    }
}
