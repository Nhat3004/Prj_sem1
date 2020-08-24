package vn.edu.vtc;

//import vn.edu.vtc.bl.DrinkBL;
//import vn.edu.vtc.bl.StaffBL;
//import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.iu.LoginIU;
import vn.edu.vtc.iu.ManagerIU;
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
        try (Connection con = vn.edu.vtc.dal.DbUtil.getConnection();) {
            System.out.println("| Connected to MySql Server successfully.           |");
        } catch (SQLException ex) {
            System.out.println("| Connection Error!                                 |");
            System.out.println(ex);
        }
        System.out.println("+---------------------------------------------------+\n");

//        String acc = "cuongdeeptry1";
//        String pss = "cuongDeeptry2";
//        StaffBL stt = new StaffBL();
//        ShopDAL spd = new ShopDAL();
//        Staff st = new Staff();
//        Shop sp = new Shop();
//        sp = spd.getShopById(1);
//        st = stt.login(acc, pss);
//        System.out.println(st);
//        System.out.println(sp);
//        if (st.getPosition().equals("Staff")) {
//            System.out.println(st.getName() + " is a " + st.getPosition());
//        }
//        ManagerIU.showTopSold();
        pos = LoginIU.login();
        if (pos.equals("Manager")) {
            ManagerIU.Manager();
        } else if (pos.equals("Staff")) {

        }
        System.out.println("See you later!");
        System.out.println("|           _               |\n" +
                "|       .__(.)< (MEOW,MEOW) |\n" +
                "|        \\___)              |\n" +
                "|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
