package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  // 当根据类型在容器中找到多个 bean,注入参数的属性名又和容器中 bean 的名称不一致，
  // 这个时候该如何解决，就需要使用到@Qualifier来指定注入哪个名称的 bean 对象
  @Autowired
  @Qualifier("bookDao1")
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
