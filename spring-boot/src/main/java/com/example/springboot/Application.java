package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = ServletWebServerFactoryAutoConfiguration.class)
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // 配置Jetty服务器
  @Bean
  public JettyServletWebServerFactory jettyServletWebServerFactory() {
    return new JettyServletWebServerFactory();
  }
}
