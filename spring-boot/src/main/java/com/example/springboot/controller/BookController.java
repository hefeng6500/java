package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  private Environment env;

  @GetMapping("/{id}")
  public String getById(@PathVariable Integer id) {
    System.out.println("id ==> " + id);

    System.out.println(env.getProperty("lesson"));
    System.out.println(env.getProperty("enterprise.name"));
    System.out.println(env.getProperty("enterprise.subject[0]"));

    return "hello , spring boot!";
  }
}

