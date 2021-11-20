package Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/do1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置相应状态码
        //resp.setStatus(200);
        //设置重定向
//        resp.setStatus(302);
//        //设置跳转的资源路径setHeader(String name,String value)
//        //location 响应头表示资源的跳转
//        resp.setHeader("location","/WebProject/do2");

        req.setAttribute("msg","hello");
//        //简化重定向
//        resp.sendRedirect("/WebProject/do2");

//        resp.sendRedirect("https://www.baidu.com");

        //获取虚拟路径
        String con =  req.getContextPath();
        resp.sendRedirect(con+"/do2");
    }
}
