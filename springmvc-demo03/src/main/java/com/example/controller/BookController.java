package com.example.controller;

import com.example.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // @Controller + ReponseBody
@RequestMapping("/books")
public class BookController {

  //@RequestMapping(method = RequestMethod.POST)
  @PostMapping
  public String save(@RequestBody Book book) {
    System.out.println("book save..." + book);
    return "{'module':'book save'}";
  }

  //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
  @DeleteMapping("/{id}")
  public String delete(@PathVariable Integer id) {
    System.out.println("book delete..." + id);
    return "{'module':'book delete'}";
  }

  //@RequestMapping(method = RequestMethod.PUT)
  @PutMapping
  public String update(@RequestBody Book book) {
    System.out.println("book update..." + book);
    return "{'module':'book update'}";
  }

  //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
  @GetMapping("/{id}")
  public String getById(@PathVariable Integer id) {
    System.out.println("book getById..." + id);
    return "{'module':'book getById'}";
  }

  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public List<Book> getAll() {
    System.out.println("book getAll is running ...");
    List<Book> bookList = new ArrayList<Book>();

    Book book1 = new Book();
    book1.setType("计算机");
    book1.setName("SpringMVC入门教程");
    book1.setDescription("小试牛刀");
    bookList.add(book1);

    Book book2 = new Book();
    book2.setType("计算机");
    book2.setName("SpringMVC实战教程");
    book2.setDescription("一代宗师");
    bookList.add(book2);

    Book book3 = new Book();
    book3.setType("计算机丛书");
    book3.setName("SpringMVC实战教程进阶");
    book3.setDescription("一代宗师呕心创作");
    bookList.add(book3);

    return bookList;
  }

}
