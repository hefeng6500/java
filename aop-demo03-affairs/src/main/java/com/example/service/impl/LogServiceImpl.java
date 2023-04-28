package com.example.service.impl;

import com.example.dao.LogDao;
import com.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
  @Autowired
  private LogDao logDao;
  @Transactional
  public void log(String out,String in,Double money ) {
    logDao.log("转账操作由"+out+"到"+in+",金额："+money);
  }
}
