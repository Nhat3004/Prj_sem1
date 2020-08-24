package vn.edu.vtc.dal;

import vn.edu.vtc.persistance.Drink;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DrinkDAL {
    public static List<Drink> getAll() {
        String sql = "select * from Drink order by sold DESC";
        List<Drink> lst = new ArrayList<>();
        try (Connection con = DbUtil.getConnection();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                lst.add(getDrink(rs));
            }
        } catch (SQLException ex) {
            lst = null;
        }
        return lst;
    }

    public static Drink getDrink(final ResultSet rs) throws SQLException {
        Drink drink = new Drink();
        drink.setCode(rs.getString("drink_code"));
        drink.setCategory(rs.getString("drink_category"));
        drink.setName(rs.getString("drink_name"));
        drink.setUnitPrice(rs.getDouble("drink_unit_price"));
        return drink;
    }
}
