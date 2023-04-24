package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
  private BookDao bookDao;

  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
  }
}
