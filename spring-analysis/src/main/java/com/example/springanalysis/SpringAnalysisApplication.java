package com.example.springanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnalysisApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(SpringAnalysisApplication.class, args);

    context.getBean("q");
  }

}
