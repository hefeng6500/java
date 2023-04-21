package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    BookDao bookDao = (BookDao) ctx.getBean("bookDao");
    BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");

    System.out.println(bookDao);
    System.out.println(bookDao1);
  }
}
