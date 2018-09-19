package com.springboot.blog.controller;

import com.springboot.blog.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    RedisUtil redisUtil;

    @GetMapping("/")
    public String index() {
        log.info("-------------------------------->这是首页");
        return "index";
    }

}
