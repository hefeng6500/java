package com.example.config;

import com.example.controller.interceptor.ProjectInterceptor;
import com.example.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.example.controller", "com.example.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
  @Autowired
  private ProjectInterceptor projectInterceptor;
  @Autowired
  private ProjectInterceptor2 projectInterceptor2;

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // 配置拦截器
    registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
    registry.addInterceptor(projectInterceptor2).addPathPatterns("/books","/books/*");
  }
}
