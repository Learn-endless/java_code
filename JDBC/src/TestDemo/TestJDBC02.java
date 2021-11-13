package TestDemo;

import Urils.JDBCUtils;
import bean.user;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class TestJDBC02 {

    @Test
    public static void test7() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "select count(id) from user";
        Long count = jt.queryForObject(sql,long.class);
        System.out.println("总记录数："+count);
    }

    @Test
    public static void test6() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "select * from user where id = 1";
        //BeanPropertyRowMapper自动封装成对象
        List<user> query = jt.query(sql,new BeanPropertyRowMapper<user>(user.class));
        for (user user1:query) {
            System.out.println(user1);
        }
    }

    @Test
    public static void test5() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "select * from user";
        List<Map<String,Object>> queryForList = jt.queryForList(sql);
        for (Map<String,Object> map:queryForList) {
            System.out.println(map);
        }
    }

    @Test
    public static void test4() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "select * from user where id = 1";
        Map<String,Object> map = jt.queryForMap(sql);
        System.out.println(map);
    }

    @Test
    public void test3() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "delete from user where id = ?";
        int update = jt.update(sql,4);
        System.out.println(update);
    }

    @Test
    public void test2() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "insert into user values(?,?,?)";
        int update = jt.update(sql,4,"xx",67);
        System.out.println(update);
    }
    @Test
    public void test1() {
        JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update user set age = 19 where id = 1";
        int i = jt.update(sql);
        System.out.println(i);
    }
}
