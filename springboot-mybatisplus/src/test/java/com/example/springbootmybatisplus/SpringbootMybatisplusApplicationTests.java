package com.example.springbootmybatisplus;

import com.example.springbootmybatisplus.dao.UserDao;
import com.example.springbootmybatisplus.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

  @Autowired
  private UserDao userDao;

  @Test
  void contextLoads() {
  }

  @Test
  void getAll() {
    List<User> users = userDao.selectList(null);
    System.out.println(users);
  }

}
