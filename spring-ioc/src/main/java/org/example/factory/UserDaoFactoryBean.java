package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
  public UserDao getObject() throws Exception {
    return new UserDaoImpl();
  }

  @Override
  public Class<?> getObjectType() {
    return null;
  }

  @Override
  public boolean isSingleton() {
    // return FactoryBean.super.isSingleton();
    return false;
  }

}
