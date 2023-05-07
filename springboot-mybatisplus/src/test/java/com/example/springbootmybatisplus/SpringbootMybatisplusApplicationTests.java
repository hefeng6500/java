package com.example.springbootmybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootmybatisplus.dao.UserDao;
import com.example.springbootmybatisplus.domain.User;
import com.example.springbootmybatisplus.domain.query.UserQuery;
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
  void testSave() {
    User user = new User();
    user.setName("Mike");
    user.setPassword("12345678");
    user.setTel("18800009999");
    user.setAge(22);

    userDao.insert(user);
  }

  @Test
  void testUpdate() {
    User user = new User();
    user.setId(1L);
    user.setName("Jack Ma");
    user.setPassword("999");
    user.setTel("19922228888");

    userDao.updateById(user);
  }

  @Test
  void testDelete() {
    Long id = 1655039397934583809L;

    userDao.deleteById(id);
  }

  @Test
  void getUserById() {
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
    IPage iPage = new Page(2, 2);
    userDao.selectPage(iPage, null);

    System.out.println("当前页码：" + iPage.getCurrent());
    System.out.println("每页显示：" + iPage.getSize());
    System.out.println("一共多少页：" + iPage.getPages());
    System.out.println("一共多少条：" + iPage.getTotal());
    System.out.println("本页当前页数据：" + iPage.getRecords());
  }


  /**
   * 按条件查询
   */
  @Test
  void testSelectByCondition() {

    // 方式一： 按条件查询
    // QueryWrapper wrapper = new QueryWrapper<>();
    // wrapper.lt("age", 30);
    // List<User> userList = userDao.selectList(wrapper);
    // System.out.println(userList);

    // 方式二： Lambda 格式查询 (优于方式一，没有魔鬼字符串 “age”)
    // QueryWrapper<User> wrapper = new QueryWrapper<User>();
    // wrapper.lambda().lt(User::getAge, 30);
    //
    // List<User> userList = userDao.selectList(wrapper);
    //
    // System.out.println(userList);


    // 方式三： Lambda 格式查询
    // LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
    // // lambdaQueryWrapper.lt(User::getAge, 30);
    //
    // // lambdaQueryWrapper.lt(User::getAge, 28).gt(User::getAge, 20);
    // lambdaQueryWrapper.lt(User::getAge, 20).or().gt(User::getAge, 25);
    // List<User> userList = userDao.selectList(lambdaQueryWrapper);
    //
    //
    // System.out.println(userList);

    UserQuery userQuery = new UserQuery();
    userQuery.setAge2(30);
    userQuery.setAge(22);


    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
    lambdaQueryWrapper.lt(null != userQuery.getAge2(), User::getAge, userQuery.getAge2())
                      .gt(null != userQuery.getAge(), User::getAge, userQuery.getAge());

    List<User> userList = userDao.selectList(lambdaQueryWrapper);
    System.out.println(userList);
  }

  /**
   * 查询投影
   */
  @Test
  void testSelectByCondition1() {
    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
    lambdaQueryWrapper.select(User::getId, User::getName);

    List<User> userList = userDao.selectList(lambdaQueryWrapper);
    System.out.println(userList);
  }


  /**
   * 查询投影
   */
  @Test
  void testSelectByCondition2() {
    QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
    // queryWrapper.select("age", "name");

    queryWrapper.select("count(*) as nums, tel");
    queryWrapper.groupBy("tel");
    List<User> userList = userDao.selectList(queryWrapper);
    System.out.println(userList);
  }


  @Test
  void testSelectByCondition3() {
    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();

    // lambdaQueryWrapper.eq(User::getName, "Jack Ma").eq(User::getPassword, "999");
    // lambdaQueryWrapper.between(User::getAge, 10, 30);
    lambdaQueryWrapper.likeRight(User::getName, "J");

    List<User> userList = userDao.selectList(lambdaQueryWrapper);
    // User user = userDao.selectOne(lambdaQueryWrapper);
    System.out.println(userList);
  }


}
