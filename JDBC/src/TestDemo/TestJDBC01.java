package TestDemo;

import Urils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC01 {
    private static JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
    public static void main(String[] args) {
        //无须手动连接，使用jt对象执行sql语句
        String  sql = "update user set age = 20 where id = 1";
        //执行sql
        int update = jt.update(sql);
        System.out.println(update);
    }
}
