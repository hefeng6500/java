package org.example.factory;

import org.example.dao.OrderDao;
import org.example.dao.impl.OrderDaoimpl;

public class OrderDaoFactory {
  // 静态工厂创建对象
  public static OrderDao getOrderDao() {
    return new OrderDaoimpl();
  }
}
