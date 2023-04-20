package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
  private BookDao bookDao = new BookDaoImpl();

  @Override
  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
  }
}
