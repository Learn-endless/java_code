<%@ page import="domain.TestObject" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/27
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
对象
    对象.属性

list
    ${list} 取出集合的字符串表示形式
    ${list[0]} 用下标来索引

map
    ${map.键名}
    ${map["键名"]}
--%>
    <%
        TestObject t = new TestObject();
        t.setName("张三");
        t.setAge(22);
        t.setBirthiday(new Date());

        request.setAttribute("t",t);

        ArrayList ret = new ArrayList();
        ret.add("aaa");
        ret.add("bbb");
        ret.add("ccc");
        ret.add(t);
        request.setAttribute("ret",ret);

        Map m = new HashMap();
        m.put("name","zhangsan");
        m.put("age",23);
        request.setAttribute("m",m);
    %>
    ${t}<br>
    ${t.name}
    ${t.age}<br>
<%--    ${t.birthiday}--%>
    ${t.birStr}<br>
    ${ret[0]}<br>
    ${m.name}
    ${m["age"]}<br>

    ${ret[3].name}<br>

<%--项目的虚拟目录--%>
    ${pageContext.request.contextPath}

</body>
</html>
