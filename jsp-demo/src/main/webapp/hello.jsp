<%--
  Created by IntelliJ IDEA.
  User: 24439
  Date: 2023/4/19
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.PrintStream" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello jsp</h1>

<%-- <%...%>：内容会直接放到_jspService()方法之中 --%>
<%
    System.out.println("hello,jsp~");
%>

<%-- <%=…%>：内容会放到out.print()中，作为out.print()的参数 --%>
<%= "hello" %>

<%!
    void  show(){}
    String name = "zhangsan";
%>

</body>
</html>
