package com.example.controller;

import com.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

  @RequestMapping("/toJumpPage")
  // 注意
  // 1.此处不能添加@ResponseBody,如果加了该注入，会直接将page.jsp当字符串返回前端
  // 2.方法需要返回String
  public String toJumpPage() {
    System.out.println("跳转页面");
    return "page.jsp";
  }

  @RequestMapping("/toText")
  // 注意此处该注解就不能省略，如果省略了,会把response text当前页面名称去查找，如果没有回报404错误
  @ResponseBody
  public String toText() {
    System.out.println("返回纯文本数据");
    return "response text";
  }

  @RequestMapping("/toJsonPOJO")
  @ResponseBody
  public User toJsonPOJO(){
    System.out.println("返回json对象数据");
    User user = new User();
    user.setName("Yang");
    user.setAge(15);
    return user;
  }

  @RequestMapping("/toJsonList")
  @ResponseBody
  public List<User> toJsonList(){
    System.out.println("返回json集合数据");
    User user1 = new User();
    user1.setName("Jack");
    user1.setAge(15);

    User user2 = new User();
    user2.setName("Mike");
    user2.setAge(12);

    List<User> userList = new ArrayList<User>();
    userList.add(user1);
    userList.add(user2);

    return userList;
  }

  @RequestMapping("/save")
  @ResponseBody
  public String save(@RequestBody User user) {
    System.out.println("user save..."+user);
    return "{'module':'user save'}";
  }

  @RequestMapping("/delete")
  @ResponseBody
  public String delete(Integer id) {
    System.out.println("user delete..." + id);
    return "{'module':'user delete'}";
  }

  @RequestMapping("/update")
  @ResponseBody
  public String update(@RequestBody User user) {
    System.out.println("user update..." + user);
    return "{'module':'user update'}";
  }

  @RequestMapping("/getById")
  @ResponseBody
  public String getById(Integer id) {
    System.out.println("user getById..." + id);
    return "{'module':'user getById'}";
  }

  @RequestMapping("/findAll")
  @ResponseBody
  public String getAll() {
    System.out.println("user getAll...");
    return "{'module':'user getAll'}";
  }

}

