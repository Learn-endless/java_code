<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<!----%>
<%--        ${}--%>
<%--        表达式中的内容--%>
<%--        1.el表达式可以进行运算 - 运算结果会输出在页面上--%>
<%--      --%>
<%--        2.el取域中的数据 - ${域名.键名}--%>
<%--                                pageContextScope--%>
<%--                                requsetScope--%>
<%--                                sessionScope--%>
<%--                                applicationScope--%>
<%--                         ${键名}--%>
<%--                                    从最小的域中开始检索，如果有直接将对应键的值取出，没有就在更大的域中找，都没有显示""--%>
<%--    -->--%>
    \${3>4}
    ${3>4}
    <h1>算术运算符</h1>
    ${3+4}<br>
    ${3%4}<br>
    ${3 mod 4}<br>
    ${3/4}<br>
    ${3 div 4}<br>

    <h1>逻辑运算符</h1>
    ${3>4 && 4<3}
    ${3>4 and 4<3}
    ${3<4 || 4<3}
    ${3>4 or 4<3}
    ${!(3>4)}
    ${not(3>4)}

    <%
        request.setAttribute("msg","hello");
        session.setAttribute("mmm","world");
        session.setAttribute("msg","hahaha");   //如果出现这种情况--同名，在检索时就必须加上域名
    %>
    ${requestScope.msg}
    ${sessionScope.mmm}
    ${msg}
    ${mmm}

</body>
</html>
