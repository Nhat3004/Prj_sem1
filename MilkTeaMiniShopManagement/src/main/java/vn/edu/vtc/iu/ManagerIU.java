package vn.edu.vtc.iu;

import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.persistance.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerIU {
    private static List<Drink> lst = new ArrayList<>();

    public static Scanner scn() {
        return new Scanner(System.in);
    }

    public static void Manager() {
        int selection = -1;
        while (selection != 0) {
            System.out.println("+----------------------------------+");
        }
    }

    public static void showTopSold() {
        int i=1;
        while (i!=0){
            List<Drink> ls = DrinkBL.getAllDrink();
            System.out.printf("Page: %d/%d\n", i, (ls.size() / 10) + 1);
            System.out.println("+-----------+--------------------------+------------------------------------+-----------+------+");
            System.out.printf("| %-10s| %-25s| %-35s| %-10s| %-5s|\n", "Code", "Category", "Name", "Unit Price", "Sold");
            System.out.println("+-----------+--------------------------+------------------------------------+-----------+------+");
            if (i <= ls.size() / 10) {
                for (int j = i * 10 - 9; j < i * 10; j++) {
                    System.out.printf("| %-10s| %-25s| %-35s| %10.1f| %5d|\n", ls.get(j).getCode(), ls.get(j).getCategory(), ls.get(j).getName(), ls.get(j).getUnitPrice(), ls.get(j).getSold());
                }
            } else {
                for (int j = i * 10 - 9; j < ls.size(); j++) {
                    System.out.printf("| %-10s| %-25s| %-35s| %10.1f| %5d|\n", ls.get(j).getCode(), ls.get(j).getCategory(), ls.get(j).getName(), ls.get(j).getUnitPrice(), ls.get(j).getSold());
                }
            }
            System.out.println("+-----------+--------------------------+------------------------------------+-----------+------+");
            System.out.printf("Enter 0 to back, or [1-%d] to choose page: ", (ls.size() / 10) + 1);
            i = scn().nextInt();
            if (i > (ls.size() / 10) + 1){
                System.err.printf("Page %d is not available!!!\nPlease, retry!\n",i);
                i=1;
            }
        }
    }
}
