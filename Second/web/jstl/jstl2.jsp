<%@ page import="domain.TestObject" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/27
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add(new TestObject("zhangsan",20,new Date()));
    list.add(new TestObject("lisi",30,new Date()));
    request.setAttribute("list",list);
%>
<table border="1px" width="500px" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>出生日期</th>
    </tr>
    <c:forEach var="user" items="${list}" varStatus="s">
        <c:if test="${s.count % 2 != 0}">
        <tr bgcolor="blue">
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birStr}</td>
        </tr>
        </c:if>
    </c:forEach>
    <c:forEach var="user" items="${list}" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="red">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
