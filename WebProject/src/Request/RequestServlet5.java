package Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * 获取请求数据的通用方法
 * 1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
 * 2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
 * 3. Enumeration<String> getParameterNames():获取所有请求的参数名称
 * 4. Map<String,String[]> getParameterMap():获取所有参数的map集合
 */
@WebServlet("/request6")
public class RequestServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当前资源转发到RequestServlet7   getRequestDispatcher("/request7");

        //获取请求资源的转发器
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/request7");
//        //携带请求和相应到对象
//        dispatcher.forward(req,resp);

        /**
         * request 请求域对象
         * 共享数据：
         * 1. void setAttribute(String name,Object obj):存储数据
         * 2. Object getAttitude(String name):通过键获取值
         * 3. void removeAttribute(String name):通过键移除键值对
         */

        //msg：hello 就在域对象存储了
         req.setAttribute("msg","hello");

        //链式转发
        req.getRequestDispatcher("/request7").forward(req,resp);


    }
}
