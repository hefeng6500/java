package com.example.springthirdbean;

import com.example.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;
import java.awt.print.Book;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    // 方式一：创建核心容器
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    // 方式二：创建核心容器，绝对路径，耦合度高，不推荐
    // ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\java-workplace\\Java\\spring-third-bean\\src\\main\\resources\\applicationContext.xml");

    // DataSource dataSource = (DataSourcetaSource) ctx.getBean("dataSource");
    // System.out.println(dataSource);

    /**
     *  Bean 的三种获取方式
     */
    // 方式一： 类型强转
    BookDao bookDao = (BookDao) ctx.getBean("bookDao");

    // 方式二：
    BookDao bookDao1 = ctx.getBean("bookDao", BookDao.class);

    // 方式三：必须保证 ioc 容器中该类型对应的 bean 只有一个对象
    BookDao bookDao2 = ctx.getBean(BookDao.class);


    bookDao.save();

    // Map<String, String> env = System.getenv();
    // System.out.println(env);
  }
}
