package com.springboot.blog.exception;

/**
 * 自定义异常
 * Created by ld on 2018/9/14.
 */
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
