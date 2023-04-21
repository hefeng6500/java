package org.example;

import org.example.dao.OrderDao;
import org.example.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
  public static void main(String[] args) {
    // OrderDao orderDao = OrderDaoFactory.getOrderDao();

    // ioc 容器通过静态工厂创建 bean
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");

    orderDao.save();
  }
}
