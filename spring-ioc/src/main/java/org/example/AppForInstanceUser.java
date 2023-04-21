package org.example;

import org.example.dao.UserDao;
import org.example.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
  public static void main(String[] args) {

    // 实例工厂函数创建对象
    // UserDaoFactory userDaoFactory = new UserDaoFactory();
    // UserDao userDao = userDaoFactory.getUserDao();
    //
    // userDao.save();

    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    UserDao userDao = (UserDao) ctx.getBean("userDao");
    UserDao userDao2 = (UserDao) ctx.getBean("userDao");

    userDao.save();

    System.out.println(userDao);
    System.out.println(userDao2);
  }
}
