package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

  @Test
  public void testSelectAll() throws IOException {
    // 1. 获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 2. 获取SqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // 3. 获取Mapper接口的代理对象
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    // 4. 执行方法
    List<Brand> brands = brandMapper.selectAll();
    System.out.println(brands);

    // 5. 释放资源
    sqlSession.close();
  }

  @Test
  public void testSelectById() throws IOException {
    // 接收参数，该id以后需要传递过来
    int id = 1;

    // 1. 获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 2. 获取SqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // 3. 获取Mapper接口的代理对象
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    // 4. 执行方法
    Brand brand = brandMapper.selectById(id);
    System.out.println(brand);

    // 5. 释放资源
    sqlSession.close();
  }

  @Test
  public void testSelectByCondition() throws IOException {
    // 接收参数
    int status = 1;
    String companyName = "华为";
    String brandName = "华为";

    // 处理参数
    companyName = "%" + companyName + "%";
    brandName = "%" + brandName + "%";

    // 1. 获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    // 2. 获取SqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 3. 获取Mapper接口的代理对象
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    // 4. 执行方法


    // 方式一 ：接口方法参数使用 @Param 方式调用的方法
    // List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);


    // 方式二 ：接口方法参数是 实体类对象 方式调用的方法
    // 封装对象
    // Brand brand = new Brand();
    // brand.setStatus(status);
    // brand.setCompanyName(companyName);
    // brand.setBrandName(brandName);
    // List<Brand> brands = brandMapper.selectByCondition(brand);

    // 方式三 ：接口方法参数是 map集合对象 方式调用的方法
    Map map = new HashMap();
    map.put("status" , status);
    map.put("companyName", companyName);
    map.put("brandName" , brandName);

    // System.out.println(brands);
    List<Brand> brands = brandMapper.selectByCondition(map);

    // 5. 释放资源
    sqlSession.close();
  }

  @Test
  public void testSelectByConditionSingle() throws IOException {
    //接收参数
    int status = 1;
    String companyName = "华为";
    String brandName = "华为";

    // 处理参数
    companyName = "%" + companyName + "%";
    brandName = "%" + brandName + "%";

    //封装对象
    Brand brand = new Brand();
    //brand.setStatus(status);
    brand.setCompanyName(companyName);
    //brand.setBrandName(brandName);

    //1. 获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //2. 获取SqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //3. 获取Mapper接口的代理对象
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
    //4. 执行方法
    List<Brand> brands = brandMapper.selectByConditionSingle(brand);
    System.out.println(brands);

    //5. 释放资源
    sqlSession.close();
  }

}
