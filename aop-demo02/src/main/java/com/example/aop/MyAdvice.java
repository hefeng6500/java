package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

  @Pointcut("execution(* com.example.dao.BookDao.findName(..))")
  private void pt(){}

  @Before("pt()")
  public void before() {
    System.out.println("before advice ..." );
  }

  @After("pt()")
  public void after() {
    System.out.println("after advice ...");
  }

  @Around("pt()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable{
    Object ret = pjp.proceed();
    return ret;
  }
  @AfterReturning("pt()")
  public void afterReturning() {
    System.out.println("afterReturning advice ...");
  }


  @AfterThrowing("pt()")
  public void afterThrowing() {
    System.out.println("afterThrowing advice ...");
  }
}
