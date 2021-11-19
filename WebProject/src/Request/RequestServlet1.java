package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * * GET /day14/demo1?name=zhangsan HTTP/1.1
 * 			* 方法：
 * 				1. 获取请求方式 ：GET
 * 					* String getMethod()
 * 				2. (*)获取虚拟目录：/day14
 * 					* String getContextPath()
 * 				3. 获取Servlet路径: /demo1
 * 					* String getServletPath()
 * 				4. 获取get方式请求参数：name=zhangsan
 * 					* String getQueryString()
 * 				5. (*)获取请求URI：/day14/demo1
 * 					* String getRequestURI():		/day14/demo1
 * 					* StringBuffer getRequestURL()  :http://localhost/day14/demo1
 *
 * 					* URL:统一资源定位符 ： http://localhost/day14/demo1	中华人民共和国
 * 					* URI：统一资源标识符 : /day14/demo1					共和国
 *
 * 				6. 获取协议及版本：HTTP/1.1
 * 					* String getProtocol()
 *
 * 				7. 获取客户机的IP地址：
 * 					* String getRemoteAddr()
 */
@WebServlet("/request")
public class RequestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求方式
        String method = req.getMethod();
        System.out.println(method);

        //动态的获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println(contextPath);

        //获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);

        //获取get方式的参数
        String queryString = req.getQueryString();
        System.out.println(queryString);

        //获取请求的URL
        String requestURI = req.getRequestURI();
        StringBuffer requestURL =  req.getRequestURL();
        System.out.println(requestURI); //WebProject/request 统一资源标识符
        System.out.println(requestURL); //http://localhost:8080/WebProject/request 统一资源定位符

        //获取协议版本
        String protocol =  req.getProtocol();
        System.out.println(protocol);

        //获取IP地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
