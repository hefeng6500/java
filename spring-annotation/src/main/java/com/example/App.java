package com.example;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookDao bookDao = (BookDao) ctx.getBean("bookDao");
    System.out.println(bookDao);

    // BookServiceImpl 类没有起名称，所以在 App 中是按照类型来获取 bean 对象
    // BookService bookService = ctx.getBean(BookService.class);

    // @Component 注解如果不起名称，会有一个默认值就是当前类名首字母小写，所以也可以按照名称获取
    BookService bookService = (BookService) ctx.getBean("bookServiceImpl");
    System.out.println(bookService);
  }
}

