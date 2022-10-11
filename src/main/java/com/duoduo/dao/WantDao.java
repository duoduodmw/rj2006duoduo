package com.duoduo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface WantDao {
    List<Map<String,String>> AllWant();

}
