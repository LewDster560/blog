package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Category;
import com.springboot.blog.mapper.CategoryMapper;
import com.springboot.blog.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
