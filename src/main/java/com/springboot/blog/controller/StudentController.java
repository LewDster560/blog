package com.springboot.blog.controller;


import com.springboot.blog.entity.Student;
import com.springboot.blog.service.StudentService;
import com.springboot.blog.vo.Mess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.sql.Wrapper;
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
@Slf4j
public class StudentController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private StudentService studentService;

    @ApiOperation(hidden = true, value = "rest")
    @GetMapping("/rest")
    public Object restTest() {
        return restTemplate.getForObject("http://localhost:8080/students", Object.class);
    }

    @ApiOperation(value = "获取所有学生信息")
    @GetMapping("/get")
    public Object getStudents() {
        List<Student> studentList = studentService.list(null);
        return Mess.succ(studentList);
    }

    @ApiOperation("保存学生信息")
    @PostMapping("/save")
    public Object postStudent(@RequestBody Student student) {
        studentService.save(student);
        return Mess.succ(null);
    }

    @ApiOperation("根据ID获取学生信息")
    @GetMapping("/{id}")
    public Object getStudent(@PathVariable("id") Integer id) {
        Student student = studentService.getById(id);
        return Mess.succ(student);
    }

    @ApiOperation("更新学生信息")
    @PutMapping("/{id}")
    public Object putStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
        try {
            Student stu = studentService.getById(id);
            stu.setAge(student.getAge());
            stu.setName(student.getName());
            studentService.updateById(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Mess.succ(null);
    }

    @ApiOperation("删除学生信息")
    @DeleteMapping("/{id}")
    public Object deleteStudent(@PathVariable Integer id) {
        studentService.removeById(id);
        return Mess.succ(null);
    }


}

