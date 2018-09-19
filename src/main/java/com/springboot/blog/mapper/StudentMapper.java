package com.springboot.blog.mapper;

import com.springboot.blog.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author liudong
 * @since 2018-09-19
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
