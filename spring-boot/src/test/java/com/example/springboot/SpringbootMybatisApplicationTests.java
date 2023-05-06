package com.example.springboot;


import com.example.springboot.dao.BookDao;
import com.example.springboot.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootMybatisApplicationTests {

  @Autowired
  private BookDao bookDao;

  @Test
  void testGetById() {
    Book book = bookDao.getById(1);
    System.out.println(book);
  }
}
