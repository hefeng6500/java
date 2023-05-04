package com.example.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
// 定义拦截器类，实现HandlerInterceptor接口
// 注意当前类必须受Spring容器控制
public class ProjectInterceptor implements HandlerInterceptor {
  @Override
  // 原始方法调用前执行的内容
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    System.out.println("preHandle...");
    // String contentType = request.getHeader("Content-Type");
    // System.out.println("preHandle..."+contentType);

    HandlerMethod hm = (HandlerMethod)handler;
    String methodName = hm.getMethod().getName();//可以获取方法的名称
    System.out.println("preHandle..."+methodName);

    return true;
  }

  @Override
  // 原始方法调用后执行的内容
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    System.out.println("postHandle...");
  }

  @Override
  // 原始方法调用完成后执行的内容
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    System.out.println("afterCompletion...");
  }
}

