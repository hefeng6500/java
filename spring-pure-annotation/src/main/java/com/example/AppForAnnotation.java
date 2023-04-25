package com.example;

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    // BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
    // BookDao bookDao1 = (BookDao) ctx.getBean(BookDao.class);
    // System.out.println(bookDao);
    // System.out.println(bookDao1);
    //
    // ctx.close();

    BookService bookService = ctx.getBean(BookService.class);
    System.out.println(bookService);

    bookService.save();

  }
}
