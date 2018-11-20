package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Post;
import com.springboot.blog.mapper.PostMapper;
import com.springboot.blog.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liudong
 * @since 2018-11-20
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
