package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
// @ComponentScan("com.example.config")
@Import({JdbcConfig.class})
public class SpringConfig {


}
