package com.example.controller;

import com.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/save")
  @ResponseBody
  public String save() {
    System.out.println("user save ...");
    return "{'module':'user save'}";
  }

  @RequestMapping("/commonParam")
  @ResponseBody
  public String commonParam(String name, int age) {
    System.out.println("普通参数传递 name ==> " + name);
    System.out.println("普通参数传递 age ==> " + age);
    return "{'module':'commonParam'}";
  }

  @RequestMapping("/commonParamDifferentName")
  @ResponseBody
  public String commonParamDifferentName(@RequestParam("name") String userName, int age) {
    System.out.println("普通参数传递 userName ==> " + userName);
    System.out.println("普通参数传递 age ==> " + age);
    return "{'module':'common param different name'}";
  }

  // POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
  @RequestMapping("/pojoParam")
  @ResponseBody
  public String pojoParam(User user) {
    System.out.println("pojo参数传递 user ==> " + user);
    return "{'module':'pojo param'}";
  }

  //数组参数：同名请求参数可以直接映射到对应名称的形参数组对象中
  @RequestMapping("/arrayParam")
  @ResponseBody
  public String arrayParam(String[] likes){
    System.out.println("数组参数传递 likes ==> "+ Arrays.toString(likes));
    return "{'module':'array param'}";
  }

  //集合参数：同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据
  @RequestMapping("/listParam")
  @ResponseBody
  public String listParam(@RequestParam List<String> likes){
    System.out.println("集合参数传递 likes ==> "+ likes);
    return "{'module':'list param'}";
  }
}
