package vn.edu.vtc;

//import vn.edu.vtc.bl.DrinkBL;
//import vn.edu.vtc.bl.StaffBL;
//import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.iu.LoginIU;
import vn.edu.vtc.iu.ManagerIU;
import vn.edu.vtc.iu.StaffIU;
//import vn.edu.vtc.persistance.Drink;
//import vn.edu.vtc.persistance.Shop;
//import vn.edu.vtc.persistance.Staff;

import java.sql.Connection;
import java.sql.SQLException;
//import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException {
        String pos;
        System.out.println("+---------------------------------------------------+");
        try (Connection con = vn.edu.vtc.dal.DbUtil.getConnection()) {
            System.out.println("| Connected to MySql Server successfully.           |");
        } catch (SQLException ex) {
            System.out.println("| Connection Error!                                 |");
            System.out.println(ex);
        }
        System.out.println("+---------------------------------------------------+\n");

        pos = LoginIU.login();
        if (pos.equals("Manager")) {
            ManagerIU.Manager();
        } else if (pos.equals("Staff")) {
            StaffIU.Staff();
        }

        System.out.println("\nSee you later!");
        System.out.println("|           _               |\n" +
                "|       .__(.)< (MEOW,MEOW) |\n" +
                "|        \\___)              |\n" +
                "|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
