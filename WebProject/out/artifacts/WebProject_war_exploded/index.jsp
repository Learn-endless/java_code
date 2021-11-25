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
   -->
  <%
    System.out.println("hello world!");

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
