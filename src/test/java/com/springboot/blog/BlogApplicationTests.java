package com.springboot.blog;

import com.springboot.blog.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedis() {
        boolean flag = redisUtil.set("1", "bad");
        System.out.println(flag);
        System.out.println(redisUtil.get("1"));
    }

}
