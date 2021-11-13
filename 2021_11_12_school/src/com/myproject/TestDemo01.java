package com.myproject;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class TestDemo01 {
    public static void main(String[] args) throws SQLException {

        //使用工具类向users表中插入一行数据
        Connection connection = JDBCUtils.getConnection();

        String sql = "insert into users values(?,?,?)";

        PreparedStatement prepareStatement = connection.prepareStatement(sql);


        prepareStatement.setInt(1, 2);

        prepareStatement.setString(2, "lisi");

        prepareStatement.setString(3, "789");

        int executeUpdate = prepareStatement.executeUpdate();

        System.out.println(executeUpdate);

        JDBCUtils.close(connection, prepareStatement);

    }
}