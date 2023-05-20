package com.example.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import java.util.Set;

@SpringBootTest
class RedisApplicationTests {

  private String string;

  @Test
  void contextLoads() {
  }

  @Test
  void testJedis() {
    // 1. 获取连接
    Jedis jedis = new Jedis("localhost", 6379);

    // 	2. 执行具体操作
    jedis.set("username", "Jack");

    String string = jedis.get("username");
    System.out.println(string);

    jedis.hset("myhash", "age", "20");
    System.out.println(jedis.hget("myhash", "age"));

    Set<String> keys = jedis.keys("*");

    for (String key : keys) {
      System.out.println(key);
    }
    
    // 	3. 关闭连接
    jedis.close();
  }

}
