package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
    // bookDao.save();
    //
    // // 关闭容器
    // // ctx.close();
    //
    // // 注册关闭容器的钩子
    // ctx.registerShutdownHook();

    BookService bookService = (BookService) ctx.getBean("bookService");

    bookService.save();

    ctx.close();
  }
}
