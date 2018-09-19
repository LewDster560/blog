package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Student;
import com.springboot.blog.mapper.StudentMapper;
import com.springboot.blog.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liudong
 * @since 2018-09-19
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
