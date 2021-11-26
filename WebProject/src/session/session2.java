package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/sess2")
public class session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        //取数据
        Object ret = session.getAttribute("msg");

        System.out.println(ret);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
//JSESSIONID=9063556AD8098C800A00097EC6868262
//JSESSIONID=9063556AD8098C800A00097EC6868262
