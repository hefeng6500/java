package org.example.dao.impl;

import org.example.dao.BookDao;
import org.example.service.impl.BookServiceImpl;

public class BookDaoImpl implements BookDao {

  private String databaseName;
  private int connectionNum;

  // 构造器注入多个简单数据类型
  // 添加多个简单属性并提供构造方法
  public BookDaoImpl(String databaseName, int connectionNum) {
    this.connectionNum = connectionNum;
    this.databaseName = databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public void setConnectionNum(int connectionNum) {
    this.connectionNum = connectionNum;
  }

  // 验证 bean 是通过构造函数创建，
  private BookDaoImpl() {
    // private 修饰符能执行成功,说明内部走的依然是构造函数,能访问到类中的私有构造方法,显而易见 Spring 底层用的是反射
    System.out.println("book dao constructor is running ....");
  }

  public void save() {
    System.out.println("book dao save ..." + databaseName + "," + connectionNum);
  }

  // 表示 bean 初始化对应的操作
  public void init() {
    System.out.println("init...");
  }

  // 表示 bean 销毁前对应的操作
  public void destory() {
    System.out.println("destory...");
  }
}
