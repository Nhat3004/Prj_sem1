package vn.edu.vtc;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try (Connection con = vn.edu.vtc.dal.DbUtil.getConnection();) {
            System.out.println("Connected to MySql Server.\n");
        } catch (SQLException ex) {
            System.out.println("Connection Error!");
            System.out.println(ex);
        }
    }
}
