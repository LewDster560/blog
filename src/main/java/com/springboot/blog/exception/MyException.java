package com.springboot.blog.exception;

/**
 * Created by ld on 2018/9/14.
 */
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
