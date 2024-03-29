package com.example;

import com.example.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

    DataSource dataSource = ctx.getBean(DataSource.class);
    System.out.println(dataSource);
  }
}
