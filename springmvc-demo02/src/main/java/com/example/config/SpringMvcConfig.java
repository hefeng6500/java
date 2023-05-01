package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.example.controller")
// 开启 json 数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}
