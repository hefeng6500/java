package org.yang.mapper;

import org.yang.pojo.User;

import java.util.List;

public interface UserMapper {
  List<User> selectAll();
  User selectById(int id);
}
