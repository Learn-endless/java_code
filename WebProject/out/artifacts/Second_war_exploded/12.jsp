<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("msg","hello");
%>
<%=
pageContext.getAttribute("msg")
%>
</body>
</html>
