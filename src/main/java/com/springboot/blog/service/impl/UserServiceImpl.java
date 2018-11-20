package com.springboot.blog.service.impl;

import com.springboot.blog.entity.User;
import com.springboot.blog.mapper.UserMapper;
import com.springboot.blog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
