package com.example.springbootmybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor() {
    // 1. 添加 Mybatis Plus 拦截器
    MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
    // 2. 添加具体的拦截器
    mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
    // 3. 添加乐观锁拦截器
    mybatisPlusInterceptor.addInnerInterceptor((new OptimisticLockerInnerInterceptor()));

    return mybatisPlusInterceptor;
  }
}
