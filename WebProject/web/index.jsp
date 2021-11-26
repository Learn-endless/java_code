<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/13
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post">
    用户：<input type="text" name="username"><br>
    密码：<input type="password" name="psw"><br>
    <input type="submit" value="登录">
  </form>
  <!--
    servlet里面些什么，这里些什么
    不用创建对象，可以直接使用的对象就是内置对象
    jsp中一共有9个内置对象

    其中三个：
          req，resp，out
    输出虚拟目录
   -->
  <%
    System.out.println("hello world!");
    request.getContextPath();

  %>
  <%
    request.setAttribute("msg","hello");
  %>
  <%
    request.getContextPath();
  %>
  <%
    request.getAttribute("msg");
  %>
  <!--
    写在成员变量位置
   -->
  <%!
    int i = 3;
  %>
  <!--
  输出到页面上
  -->
  <%=
  i
  %>
  </body>
</html>
