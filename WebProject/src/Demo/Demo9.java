package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downloadServlet")
public class Demo9 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        //1.获取页面上的文件名称

        String filename = req.getParameter("filename");

        //2.获取文件资源的真实路径

        ServletContext servletContext = this.getServletContext();

        String path = servletContext.getRealPath("/img/"+filename);

        //3.将文件加载进内存

        FileInputStream fis = new FileInputStream(path);

        //4.设置响应头

        //4.1获取Mime类型
        String mimeType = servletContext.getMimeType(filename);

        //4.2设置mimetype	contentType

        resp.setHeader("contentType", mimeType);

        //4.3	content-disposition  attachment

        resp.setHeader("content-disposition", "attachment;filename"+filename);

        //5.写出数据

        ServletOutputStream ops = resp.getOutputStream();

        byte[] arr = new byte[1024*8];

        int len = 0;

        while((len=fis.read(arr))!=-1) {
            ops.write(arr, 0, len);
        }

        fis.close();

    }

}
