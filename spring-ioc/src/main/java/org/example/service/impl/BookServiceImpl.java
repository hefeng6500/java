package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
  // private BookDao bookDao = new BookDaoImpl();
  private BookDao bookDao;

  @Override
  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
  }

  // 提供对应的set方法
  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }
}
