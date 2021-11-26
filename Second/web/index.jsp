<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  <%--%>
<%--    int i = 3/0;--%>
<%--    List list = new ArrayList();--%>
<%--  %>--%>
  <%
    pageContext.setAttribute("msg","hello");
  %>
  <%=
    pageContext.getAttribute("msg")
  %>
  </body>
</html>
