package com.offcn.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet 顶层的接口，有五个需要被实现的方法
 *
 * GenericServlet 实现了Servlet的接口的实现类
 * 将Servlet中的抽象方法进行了实现
 * 继承这个类就可以不用实现其他的方法了
 *
 * web应用的数据传输是基于http协议的
 * http:请求方式 post get
 * 每种请求方式的数据的处理形式是不一样的，所以我们就需要按照不同的请求方式分别去处理业务
 *
 * HttpServlet
 * 在servlet中进行请求方式的判断，分别用对应的方法进行业务的处理
 *
 * doGet(HttpServletRequest HttpServletResponse)处理get请求
 *
 */
@WebServlet("/demo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get.........");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post........");
    }
}
