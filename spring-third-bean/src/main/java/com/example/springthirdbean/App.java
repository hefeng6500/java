package com.example.springthirdbean;

import com.example.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    // DataSource dataSource = (DataSourcetaSource) ctx.getBean("dataSource");
    // System.out.println(dataSource);

    BookDao bookDao = (BookDao) ctx.getBean("bookDao");
    bookDao.save();

    // Map<String, String> env = System.getenv();
    // System.out.println(env);
  }
}
