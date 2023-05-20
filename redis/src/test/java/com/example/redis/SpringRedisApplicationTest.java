package com.example.redis;


import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringRedisApplicationTest {

  @Autowired
  RedisTemplate redisTemplate;

  /**
   * 操作 String 类型数据
   */
  @Test
  public void testSpringRedis() {
    ValueOperations valueOperations = redisTemplate.opsForValue();

    valueOperations.set("username80", "Bob");

    valueOperations.set("city", "shenzhen", 10, TimeUnit.SECONDS);

    Boolean aBoolean = valueOperations.setIfAbsent("city", "1234");

    System.out.println(aBoolean);
    System.out.println(valueOperations.get("username"));
  }


  /**
   * 操作 Hash 类型数据
   */
  @Test
  public void testHash() {
    HashOperations hashOperations = redisTemplate.opsForHash();

    hashOperations.put("001", "name", "Jack");
    hashOperations.put("001", "age", "20");
    hashOperations.put("001", "address", "beijing");

    String name = (String) hashOperations.get("001", "name");

    System.out.println(name);

    // 获取 hash 结构的所有 key
    Set keys = hashOperations.keys("001");

    for (Object key : keys) {
      System.out.println(key);
    }

    //   获取 hash 集合中的所有值
    List list = hashOperations.values("001");
    for (Object value : list) {
      System.out.println(value);
    }
  }

  /**
   * List 数据类型
   */
  @Test
  public void testList() {
    ListOperations listOperations = redisTemplate.opsForList();

    // 设置值
    listOperations.leftPush("mylist", "a");
    listOperations.leftPushAll("mylist", "b", "c", "d");

    // 取值
    List<String> mylist = listOperations.range("mylist", 0, -1);

    for (String value : mylist) {
      System.out.println(value);
    }

    Long size = listOperations.size("mylist");
    int lSize = size.intValue();

    // 出队列
    for (int i = 0; i < lSize; i++) {
      String element = (String) listOperations.rightPop("mylist");

      System.out.println(element);
    }

  }


  /**
   * 操作 Set 类型的数据
   */
  @Test
  public void testSet() {

    SetOperations setOperations = redisTemplate.opsForSet();

    //   存值
    setOperations.add("myset", "a", "b", "a", "c");
    Set<String> myset = setOperations.members("myset");

    for (String o : myset) {
      System.out.println(o);
    }

    //   删除成员
    setOperations.remove("myset", "a", "c");

    myset = setOperations.members("myset");

    for (String o : myset) {
      System.out.println(o);
    }
  }

  /**
   * 操作 Zet 类型数据
   */
  @Test
  public void testZSet() {
    ZSetOperations zSetOperations = redisTemplate.opsForZSet();

    // 存值
    zSetOperations.add("myZset", "a", 10.0);
    zSetOperations.add("myZset", "b", 11.0);
    zSetOperations.add("myZset", "c", 12.0);
    zSetOperations.add("myZset", "a", 13.0);

    //   取值
    Set<String> myZset = zSetOperations.range("myZset", 0, -1);
    for (String s : myZset) {
      System.out.println(s);
    }

    System.out.println("====================");

    // 修改分数
    zSetOperations.incrementScore("myZset", "b", 20.0);
    myZset = zSetOperations.range("myZset", 0, -1);

    for (String s : myZset) {
      System.out.println(s);
    }

    System.out.println("====================");
    //   删除成员
    zSetOperations.remove("myZset", "a", "b");

    myZset = zSetOperations.range("myZset", 0, -1);

    for (String s : myZset) {
      System.out.println(s);
    }
  }

  /**
   * 通用操作
   */
  @Test
  public void commonTest() {
    //   获取所有的 key
    Set<String> keys = redisTemplate.keys("*");

    System.out.println(keys);

    for (String key : keys) {
      System.out.println(key);
    }

    // //   判断 key 是否存在
    // Boolean myZset = redisTemplate.hasKey("myZset");
    // System.out.println(myZset);
    //
    // //   删除指定 key
    // redisTemplate.delete("myZset");
    //
    // //   获取指定 key 对应的 value 的数据类型
    // DataType dataType = redisTemplate.type("myset");
    //
    // System.out.println(dataType.name());
  }
}
