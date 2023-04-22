package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {


  // private BookDao bookDao = new BookDaoImpl();
  private BookDao bookDao;

  // 构造器注入
  public BookServiceImpl(BookDao bookDao){
    this.bookDao = bookDao;
  }

  // 提供对应的set方法
  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  @Override
  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("service destroy");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("service init");
  }
}
