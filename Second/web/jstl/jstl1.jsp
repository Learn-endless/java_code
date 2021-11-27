<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/27
  Time: 9:34
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
<%--
c:if  相当于if
        test属性必须要写
        true在页面显示
        false不在页面显示
c:choose 相当于 switch
        c:when 相当于case
        c:otherwise 相当于default
c:foreach 相当于for循环
        1.重复的逻辑
                var:临时变量
                step:表示步长
                begin:开始
                end:结束
                varStatus:循环状态
                    index:索引
                    count:次数
        2.遍历容器
                var:临时变量
                items:遍历的容器
                varStatus:循环状态


--%>
<c:if test="true">
    <h1>我为真...</h1>
</c:if>
<c:if test="false">
    <h1>我为假...</h1>
</c:if>

<%
    request.setAttribute("number",3);
%>
<c:choose>
    <c:when test="${number == 1}">星期一</c:when>
    <c:when test="${number == 2}">星期二</c:when>
    <c:when test="${number == 3}">星期三</c:when>
    <c:when test="${number == 4}">星期四</c:when>
    <c:when test="${number == 5}">星期五</c:when>
    <c:when test="${number == 6}">星期六</c:when>
    <c:when test="${number == 7}">星期七</c:when>
    <c:otherwise>有误</c:otherwise>
</c:choose>

<c:forEach begin="1" end="10" var="i" step="1" varStatus="s">
    ${i}${s.count}<br>
</c:forEach>

<%
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    request.setAttribute("list",list);
%>
    <c:forEach var="str" items="${list}" varStatus="s">
        ${str}${s.index}${s.count}<br>
    </c:forEach>

</body>
</html>
