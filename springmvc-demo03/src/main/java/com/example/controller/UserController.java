package com.example.controller;

import com.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
  public User toJsonPOJO() {
    System.out.println("返回json对象数据");
    User user = new User();
    user.setName("Yang");
    user.setAge(15);
    return user;
  }

  @RequestMapping("/toJsonList")
  @ResponseBody
  public List<User> toJsonList() {
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

  // 设置当前请求方法为POST，表示REST风格中的添加操作
  @RequestMapping(value = "/users", method = RequestMethod.POST)
  @ResponseBody
  public String save() {
    System.out.println("user save...");
    return "{'module':'user save'}";
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  // 参数别名 id => userId
  public String delete(@PathVariable("id") Integer userId) {
    System.out.println("user delete..." + userId);
    return "{'module':'user delete'}";
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
  @ResponseBody
  public String update(@RequestBody User user) {
    System.out.println("user update..." + user);
    return "{'module':'user update'}";
  }

  //设置当前请求方法为GET，表示REST风格中的查询操作
  @RequestMapping(value = "/users/{id}" ,method = RequestMethod.GET)
  @ResponseBody
  public String getById(@PathVariable Integer id) {
    System.out.println("user getById..." + id);
    return "{'module':'user getById'}";
  }

  //设置当前请求方法为GET，表示REST风格中的查询操作
  @RequestMapping(value = "/users" ,method = RequestMethod.GET)
  @ResponseBody
  public String getAll() {
    System.out.println("user getAll...");
    return "{'module':'user getAll'}";
  }

}

