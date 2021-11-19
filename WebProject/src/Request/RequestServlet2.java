package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 *   (*)String getHeader(String name):通过请求头的名称获取请求头的值
 * 	 Enumeration<String> getHeaderNames():获取所有的请求头名称
 */
@WebServlet("/request2")
public class RequestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Enumeration<String> names = req.getHeaderNames();
       //hasMoreElements()判断是否有下一个元素的方法，如果有返回true
       while(names.hasMoreElements()){
           //指向对应的下一个元素
           String name = names.nextElement();
           //得到所有的请求头的名称
           System.out.println(name);
           //获取每一个请求头的对应信息
           String header = req.getHeader(name);
           System.out.println(header);
       }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
