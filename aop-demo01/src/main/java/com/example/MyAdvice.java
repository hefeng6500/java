package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

  // 两种方式都可以
  // @Pointcut("execution(void com.example.dao.impl.BookDaoImpl.update())") 不建议使用：描述切入点通**==常描述接口==**，而不描述实现类,如果描述到实现类，就出现紧耦合了
  @Pointcut("execution(void com.example.dao.BookDao.update())")
  private void pt() {
  }

  @Before("pt()")
  public void before() {
    System.out.println("before advice ...");
  }

  @After("pt()")
  public void after() {
    System.out.println("after advice ...");
  }

  @Pointcut("execution(int com.example.dao.BookDao.select())")
  private void pt2(){}

  @Around("pt2()")
  public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("around before advice ...");

    // 表示对原始操作的调用
    Object obj = proceedingJoinPoint.proceed();

    System.out.println("around after advice ...");

    return obj;
  }

  public void afterReturning() {
    System.out.println("afterReturning advice ...");
  }

  public void afterThrowing() {
    System.out.println("afterThrowing advice ...");
  }
}
