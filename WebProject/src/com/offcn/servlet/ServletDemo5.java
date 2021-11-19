package com.offcn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * urlpatterns属性
 * 注意：
 *     服务器下不能出现相同的servlet资源的请求路径.
 *     /也不能省略，它代表一级目录
 * String[] 一次可以设置多个请求路径:{"/demo5","/demo6"}
 * 多级目录："/demo5/demo6"
 * 加上后缀的写法：*.do(*表示通配符)
 */
@WebServlet("*.do")
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post....");
    }
}
