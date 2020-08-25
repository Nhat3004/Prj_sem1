package vn.edu.vtc;

import vn.edu.vtc.bl.StaffBL;
import vn.edu.vtc.iu.LoginIU;
import vn.edu.vtc.persistance.Staff;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("+---------------------------------------------------+");
        try (Connection con = vn.edu.vtc.dal.DbUtil.getConnection()) {
            System.out.println("| Connected to MySql Server successfully.           |");
        } catch (SQLException ex) {
            System.out.println("| Connection Error!                                 |");
            System.out.println(ex);
        }
        System.out.println("+---------------------------------------------------+\n");

        LoginIU.login();

        System.out.println("\nSee you later!");
        System.out.println("|~~~~~~~~~~~_~~~~~~~~~~~~~~~|\n" +
                "|       .__(.)< (MEOW,MEOW) |\n" +
                "|        \\___)              |\n" +
                "|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
