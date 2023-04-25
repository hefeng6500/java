package com.example.dao.impl;

import com.example.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
// @Scope("prototype")
public class BookDaoImpl implements BookDao {

  @Value("HeFeng-Lab")
  private String name;

  public void save() {
    System.out.println("book dao save ..." + name);
  }

  @PostConstruct
  public void init() {
    System.out.println("init ...");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("destroy ...");
  }
}
