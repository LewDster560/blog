package com.springboot.blog.controller;


import com.springboot.blog.entity.Student;
import com.springboot.blog.service.StudentService;
import com.springboot.blog.vo.Mess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liudong
 * @since 2018-09-19
 */
@Api(tags = "学生控制器", description = "学生类的控制器")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "获取所有学生信息")
    @GetMapping("/get")
    public Object getStudents() {
        List<Student> studentList = studentService.list(null);
        return Mess.succ(studentList);
    }

    @ApiOperation("更新学生")
    @PostMapping("/update")
    public Object postStudent(@RequestBody Student student) {
        studentService.save(student);
        return Mess.succ(null);
    }

    @GetMapping("/{id}")
    public Object getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getById(id);
        return Mess.succ(student);
    }

    @PutMapping("/{id}")
    public Object putStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        Student stu = studentService.getById(id);
        stu.setAge(student.getAge());
        stu.setName(student.getName());
        studentService.updateById(stu);

        return Mess.succ(null);
    }

    @DeleteMapping("/{id}")
    public Object deleteStudent(@PathVariable Long id) {
        studentService.removeById(id);
        return Mess.succ(null);
    }


}

