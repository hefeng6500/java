package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
  public void save() {
    System.out.println("book dao save ..." );
  }
}
