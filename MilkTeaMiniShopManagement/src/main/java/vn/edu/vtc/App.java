package vn.edu.vtc;

import vn.edu.vtc.bl.StaffBL;
import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.persistance.Shop;
import vn.edu.vtc.persistance.Staff;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection con = vn.edu.vtc.dal.DbUtil.getConnection();) {
            System.out.println("Connected to MySql Server successfully.\n");
        } catch (SQLException ex) {
            System.out.println("Connection Error!");
            System.out.println(ex);
        }
        String acc="Nhatnl3004";
        String pss="Nhatnl19024";
        StaffBL stt =new StaffBL();
        ShopDAL spd = new ShopDAL();
        Staff st = new Staff();
        Shop sp = new Shop();
        sp=spd.getShopById(1);
        st=stt.login(acc,pss);
        System.out.println(st);
        System.out.println(sp);
        if (st.getPosition().equals("Staff")){
            System.out.println(st.getName()+" is a "+st.getPosition());
        }

    }
}
