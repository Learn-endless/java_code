package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * 获取请求数据的通用方法
 * 1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
 * 2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
 * 3. Enumeration<String> getParameterNames():获取所有请求的参数名称
 * 4. Map<String,String[]> getParameterMap():获取所有参数的map集合
 */
@WebServlet("/request5")
public class RequestServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //解决中文乱码
        req.setCharacterEncoding("utf-8");

        //根据参数名称获取参数值
//        String name = req.getParameter("username");
//        String pwd = req.getParameter("psw");
//        System.out.println("name="+name+"pwd="+pwd);

        //根据参数名称获取参数值的数组
//        String[] values = req.getParameterValues("hobby");
//        System.out.println(Arrays.toString(values));

        //获取所有请求的参数名称
//        Enumeration<String> names = req.getParameterNames();
//        while (names.hasMoreElements()) {
//            String name = names.nextElement();
//            String value = req.getParameter(name);
//            System.out.println("name=" + name + ",value=" + value);
//        }

            //获取所有参数的map集合
        Map<String,String[]> map = req.getParameterMap();
        //双列集合没有办法直接遍历，需要先转换成单列集合
        Set<String> keySet = map.keySet();
        for (String key:keySet) {
            System.out.println(key);
            String[] strs = map.get(key);
            for (String value:strs) {
                System.out.println(value);
            }
        }
    }
}
