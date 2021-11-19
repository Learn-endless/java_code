package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *				* (*)String getHeader(String name):通过请求头的名称获取请求头的值
 * 				* Enumeration<String> getHeaderNames():获取所有的请求头名称
 */
@WebServlet("/request3")
public class RequestServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String header = req.getHeader("user-agent");
            System.out.println(header);
//        contains:判断是否包含指定字符串
            if(header.contains("Chrome")){
                System.out.println("谷歌浏览器....");
            }
            if(header.contains("Firefox")){
                System.out.println("火狐浏览器....");
            }

        //获取referer
        String referer =  req.getHeader("referer");
        System.out.println(referer);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
