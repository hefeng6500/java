package com.example.service.impl;

import com.example.dao.AccountDao;
import com.example.service.AccountService;
import com.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountDao accountDao;


  @Autowired
  private LogService logService;


  @Transactional(rollbackFor = {IOException.class})
  public void transfer(String out,String in ,Double money)  {
    accountDao.outMoney(out,money);


    try{
      accountDao.outMoney(out,money);
      accountDao.inMoney(in,money);
    }finally {
      logService.log(out,in,money);
    }
  }
}
