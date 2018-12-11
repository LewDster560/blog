package com.homework.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.homework.entity.Post;
import com.homework.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@Controller
@Api(description = "首页控制器", tags = "首页控制器", value = "首页控制器")
public class IndexController extends BaseController {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    @ApiOperation(value = "首页")
    public String index() {
        log.info("-------------------------------->这是首页");
        Page<Post> page = new Page<>();
        page.setCurrent(1);
        page.setSize(10);
        IPage<Map<String, Object>> pageData = postService.pageMaps(page, null);

        //添加关联的用户信息
        userService.join(pageData,"user_id");
        req.setAttribute("pageData", pageData);

        log.info("--------------->" + pageData.getRecords());
        log.info("-------------------------------" + page.getPages());

        return "index";
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
