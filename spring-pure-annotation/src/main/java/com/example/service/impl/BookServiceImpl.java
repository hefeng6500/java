package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  @Autowired
  private BookDao bookDao;

  // @Autowired 可以写在属性上，也可也写在 setter 方法上，最简单的处理方式是写在属性上并将setter方法删除掉
  
  // public void setBookDao(BookDao bookDao) {
  //   this.bookDao = bookDao;
  // }

  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
  }
}
