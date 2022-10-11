import com.alibaba.fastjson.JSON;
import com.duoduo.dao.AdminDao;
import com.duoduo.dao.GoodDao;
import com.duoduo.dao.ShopDao;
import com.duoduo.dao.UserDao;

import com.duoduo.pojo.Good;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ShopDao shopDao = applicationContext.getBean("shopDao", ShopDao.class);
        GoodDao goodDao = applicationContext.getBean("goodDao", GoodDao.class);
        Good good=new Good();
        good.setGID(4);
        good.setGName("火龙果");
        good.setGPrice("20");
        good.setGContent("真的很好吃");
        good.setSID(1001);
        System.out.println(goodDao.addGood(good));
//        final List<Map<String, String>> maps = userDao.AllShop();
//        System.out.println(JSON.toJSONString(maps));

    }
}
