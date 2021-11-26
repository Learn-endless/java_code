<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //1.处理响应的编码
    response.setContentType("text/html;charset=utf-8");

    //2.获取所有的cookie
    Cookie[] cookies = request.getCookies();
    boolean flag = true;
    //3.判断是否有lastTime的cookie
    if(cookies!=null && cookies.length!=0) {
    //cookies不为空
    for (Cookie cookie : cookies) {
    if(cookie.getName().equals("lastTime")) {
    //不是第一次访问
    flag = false;
    //获取当前时间并且设置 cookie的值
    Date date = new Date();
    //%B1%A6 URL
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    //时间日期格式化

    String str = sdf.format(date);
    System.out.println("编码前："+str);
    //URL编码
    str = URLEncoder.encode(str,"utf-8");
    System.out.println("编码后:"+str);
    //持久化cookie
    cookie.setMaxAge(60*60*24*30);

    //设置value
    cookie.setValue(str);
    //URL解码
    System.out.println("解码前:"+str);
    str = URLDecoder.decode(str,"utf-8");
    System.out.println("解码后:"+str);
    //输出对应的信息
    response.getWriter().write("<h1>欢迎回来,"+str+"</h1>");

    break;
            }
        }
    }

    if(cookies == null || cookies.length == 0 || flag) {
    //第一次访问
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    //时间日期格式化
    String str = sdf.format(date);
    System.out.println("编码前："+str);
    //URL编码
    str = URLEncoder.encode(str,"utf-8");
    System.out.println("编码后:"+str);
    //新建cookie
    Cookie cookie = new Cookie("lastTime",str);
    //持久化存储cookie
    cookie.setMaxAge(60*60*24*30);

    //发送cookie
    response.addCookie(cookie);

    //写出对应的信息
    response.getWriter().write("<h1>欢迎您首次访问</h1>");
    }

%>
</body>
</html>
