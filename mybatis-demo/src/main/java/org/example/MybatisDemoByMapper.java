package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.UserMapper;
import org.example.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemoByMapper {
  public static void main(String[] args) throws IOException {

    // 1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 2. 获取SqlSession对象，用它来执行sql
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // 3. 执行sql
    // 获取 UserMapper 接口的代理对象
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = userMapper.selectAll();

    User user = userMapper.selectById(1);

    System.out.println(users);
    System.out.println(user);

    //4. 释放资源
    sqlSession.close();
  }
}
