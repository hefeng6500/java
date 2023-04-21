package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

  // 验证 bean 是通过构造函数创建，
  private BookDaoImpl() {
    // private 修饰符能执行成功,说明内部走的依然是构造函数,能访问到类中的私有构造方法,显而易见 Spring 底层用的是反射
    System.out.println("book dao constructor is running ....");
  }


  public void save() {
    System.out.println("book dao save...");
  }
}
