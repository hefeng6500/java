package org.example;

import org.example.dao.OrderDao;
import org.example.factory.OrderDaoFactory;

public class AppForInstanceOrder {
  public static void main(String[] args) {
    OrderDao orderDao = OrderDaoFactory.getOrderDao();

    orderDao.save();
  }
}
