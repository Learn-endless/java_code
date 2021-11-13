package TestDemo;

import Urils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//public class TestJDBC {
//    public static void main(String[] args) throws SQLException {
//        Connection connection = JDBCUtils.getConnection();
//        String sql = "insert into user values(?,?,?)";
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.setInt(2,2);
//        ps.setString(2,"lisi");
//        ps.setInt(3,17);
//        int i = ps.executeUpdate();
//        System.out.println(i);
//        JDBCUtils.close(connection,ps);
//    }
//}
