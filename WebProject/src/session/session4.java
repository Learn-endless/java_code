package session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/sess4")
public class session4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
        String checkCode = req.getParameter("checkCode");
        HttpSession session = req.getSession();
        String code_session = (String)session.getAttribute("code_session");
        session.removeAttribute("code_session");
        //校验验证码
        if(code_session != null && code_session.equalsIgnoreCase(checkCode)){  //忽略大小写
            //验证码正确
            if("张三".equals(username)&&"123".equals(password)){
                //存储用户名
                req.getSession().setAttribute("name",username);
                //跳转重定向
                resp.sendRedirect(req.getContextPath()+"/success.jsp");
            }else{
                //失败
                req.setAttribute("login_error","用户名或密码错误");
                req.getRequestDispatcher("/jsp.jsp").forward(req,resp);
            }
        }else{
            req.setAttribute("code_error","验证码错误");
            req.getRequestDispatcher("/jsp.jsp").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
