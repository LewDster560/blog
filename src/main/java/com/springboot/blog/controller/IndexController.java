package com.springboot.blog.controller;

import com.springboot.blog.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Controller
@Api(description = "首页控制器", tags = "首页控制器", value = "首页控制器")
public class IndexController {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    @ApiOperation(value = "首页")
    public String index() {
        log.info("-------------------------------->这是首页");
        return "index";
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
