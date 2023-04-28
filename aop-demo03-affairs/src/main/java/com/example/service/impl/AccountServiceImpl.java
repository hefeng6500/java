package com.example.service.impl;

import com.example.dao.AccountDao;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountDao accountDao;


  @Transactional
  public void transfer(String out,String in ,Double money) {
    accountDao.outMoney(out,money);

    // int i = 1/0;

    accountDao.inMoney(in,money);
  }
}
