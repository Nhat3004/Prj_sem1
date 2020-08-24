package vn.edu.vtc.bl;

import vn.edu.vtc.dal.DrinkDAL;
import vn.edu.vtc.persistance.Drink;

import java.util.List;

public class DrinkBL {
    public static List<Drink> getAllDrink(){
        return DrinkDAL.getAll();
    }
}
