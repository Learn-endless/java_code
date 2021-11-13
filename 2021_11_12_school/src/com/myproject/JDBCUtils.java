package com.myproject;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;


/**
 *
 *
 * @author Administrator
 *
 * 工具类
 * 不需要创建对象
 * 工具类中的方法和内容一般都是不变的
 * 所以不需要创建对象 直接调用常量或者方法使用即可
 *
 * 工具类中的方法 都是静态方法
 *
 * 配置文件放在src文件夹下
 *
 */
public class JDBCUtils {

    /**
     * 从配置文件中拿出所需要的变量值
     *
     */
    static String driver = null;
    static String username = null;
    static String password = null;
    static String url = null;
    static{

        //关联配置文件的操作
        //getClassLoder 获取当前类路径的类加载器
        //通过当前的类加载器获取流对象 用于加载类路径下的配置文件
        InputStream stream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

        /**
         * properties 配置文件有一个Properties 类型专门用于操作这种配置文件
         *
         */
        Properties p = new Properties();

        //load()方法 就是记载配置文件的

        try {
            p.load(stream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //properties类型中有一个 getProperty的方法 根据属性名获取属性值

        driver = p.getProperty("driver");

        //System.out.println(driver);

        url = p.getProperty("url");

        username = p.getProperty("username");

        password = p.getProperty("password");

        //1.注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //2.获取连接
    public static Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(url,username,password);
    }


    //3.释放资源
    public static void close(Connection conn,PreparedStatement ps){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn,PreparedStatement ps,ResultSet rs){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

