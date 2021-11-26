package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/sess3")
public class session3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session
        HttpSession ret = req.getSession();
        ret.setAttribute("msg","abcdefgh");
        //创建
        Cookie c = new Cookie("JSESSIONID",ret.getId());
        //持久化
        c.setMaxAge(300);
        //发送cookie
        resp.addCookie(c);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
