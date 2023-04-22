package com.example.dao.impl;

import com.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

  private String databaseName;
  private int connectionNum;

  public void save() {
    System.out.println("book dao save ...");
  }
}
