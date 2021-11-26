<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <%
        String str = "，欢迎您！";
    %>
    <%=
        request.getSession().getAttribute("name")
    %>
    <%=
        str
    %>
</h1>
</body>
</html>
