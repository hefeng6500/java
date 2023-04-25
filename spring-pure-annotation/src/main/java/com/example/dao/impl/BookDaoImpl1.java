package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao1")
public class BookDaoImpl1 implements BookDao {
  public void save() {
    System.out.println("book dao save ...1");
  }
}
