package com.example;

import com.example.config.SpringConfig;
import com.example.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

    System.out.println(ctx.getBean(UserController.class));
  }
}
