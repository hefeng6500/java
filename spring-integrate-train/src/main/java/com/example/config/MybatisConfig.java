package com.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
  // 定义 bean，SqlSessionFactoryBean，用于产生 SqlSessionFactory 对象
  @Bean
  public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

    sqlSessionFactoryBean.setTypeAliasesPackage("com.example.domain");
    sqlSessionFactoryBean.setDataSource(dataSource);

    return sqlSessionFactoryBean;
  }

  // 定义 bean，返回 MapperScannerConfigurer 对象
  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setBasePackage("com.example.dao");

    return mapperScannerConfigurer;
  }
}
