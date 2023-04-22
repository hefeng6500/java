package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.UserDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {


  // private BookDao bookDao = new BookDaoImpl();
  private BookDao bookDao;
  private UserDao userDao;

  // 构造器注入
  public BookServiceImpl(BookDao bookDao, UserDao userDao){
    this.bookDao = bookDao;
    this.userDao = userDao;
  }

  // 提供对应的set方法
  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  @Override
  public void save() {
    System.out.println("book service save ...");
    bookDao.save();
    userDao.save();
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
