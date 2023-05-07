package com.example.springbootmybatisplus;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
  void testSave(){
    User user = new User();
    user.setName("Yang");
    user.setPassword("12345678");
    user.setTel("'18800009999'");
    user.setAge(22);

    userDao.insert(user);
  }

  @Test
  void testUpdate(){
    User user = new User();
    user.setId(1L);
    user.setName("Jack Ma");
    user.setPassword("999");
    user.setTel("19922228888");

    userDao.updateById(user);
  }

  @Test
  void testDelete(){
    Long id = 1655039397934583809L;

    userDao.deleteById(id);
  }

  @Test
  void getUserById(){
    User user = userDao.selectById(1L);
    System.out.println(user);
  }

  @Test
  void getAll() {
    List<User> users = userDao.selectList(null);
    System.out.println(users);
  }

  @Test
  void testGetByPage() {
    IPage iPage = new Page(2,2);
    userDao.selectPage(iPage, null);

    System.out.println("当前页码：" + iPage.getCurrent());
    System.out.println("每页显示：" + iPage.getSize());
    System.out.println("一共多少页：" + iPage.getPages());
    System.out.println("一共多少条：" + iPage.getTotal());
    System.out.println("本页当前页数据：" + iPage.getRecords());
  }
}
