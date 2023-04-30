package com.example.service.impl;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  public void save(User user) {
    System.out.println("user service ...");
  }
}
