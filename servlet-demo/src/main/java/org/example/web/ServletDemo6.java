package org.example.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo6")
public class ServletDemo6 extends MyHttpServlet {

  @Override
  protected void doGet(ServletRequest req, ServletResponse res) {
    System.out.println("get...");
  }

  @Override
  protected void doPost(ServletRequest req, ServletResponse res) {
    System.out.println("post...");
  }
}


