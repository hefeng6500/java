package com.example.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
  // 除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
  @ExceptionHandler(Exception.class)
  public Result doException(Exception ex) {
    System.out.println("嘿嘿,异常你哪里跑！");
    return new Result(666,null,"嘿嘿,异常你哪里跑！");
  }
}

