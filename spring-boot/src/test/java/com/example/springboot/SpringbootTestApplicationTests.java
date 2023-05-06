package com.example.springboot;

import com.example.springboot.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootTestApplicationTests {
  @Autowired
  private BookService bookService;

  @Test
  public void save(){
    bookService.save();
  }
}
