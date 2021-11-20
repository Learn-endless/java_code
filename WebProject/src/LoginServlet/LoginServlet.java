package LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求中文乱码的问题
        req.setCharacterEncoding("utf-8");
        //获取用户名和密码
        String name = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        //比较用户名和密码
        if(name.equals("张三")&&pwd.equals("123")){
            //在域对象中存储用户名
            req.setAttribute("name",name);

            //跳转到登录成功的页面
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }else{
            //跳转到登录失败的页面
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }
    }
}
