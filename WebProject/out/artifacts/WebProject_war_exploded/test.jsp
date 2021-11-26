<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.getWriter().write("<h1>hello</h1>");
%>
<%
    out.write("<h1>内置对象</h1>");
    request.setAttribute("msg","hello");
%>
<%=
    request.getContextPath()
%>
<%=
    request.getAttribute("msg")
%>
</body>
</html>
