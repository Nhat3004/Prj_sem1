package vn.edu.vtc.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil{
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/Prj1?useUnicode=true&characterEncoding=utf-8";
    private static String user = "shop";
    private static String password = "88888888";

    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}