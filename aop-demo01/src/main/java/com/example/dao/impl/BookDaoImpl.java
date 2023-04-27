package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
  public void save() {
    System.out.println(System.currentTimeMillis());
    System.out.println("book dao save ...");
  }

  public void update() {
    System.out.println("book dao update ...");
  }

  public void delete() {
    System.out.println("book dao delete ...");
  }

  public int select() {
    System.out.println("book dao select is running ...");
    int i = 1/0;
    return 100;
  }
}
