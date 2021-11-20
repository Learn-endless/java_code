package Demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/sdemo5")
public class Demo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取文件的真实路径
        ServletContext con = this.getServletContext();

        String b = con.getRealPath("b.txt");
        System.out.println(b);

        String c = con.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        String d = con.getRealPath("/WEB-INF/lib/d.txt");
        System.out.println(d);

        String a = con.getRealPath("/src/a.txt");
        System.out.println(a);
    }
}
