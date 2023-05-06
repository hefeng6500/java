package com.example.springboot.dao;

import com.example.springboot.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface BookDao {
  @Select("select * from tbl_book where id = #{id}")
  public Book getById(Integer id);
}

