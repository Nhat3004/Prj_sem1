package vn.edu.vtc.iu;

import java.util.Scanner;

public class StaffIU {
    private static Scanner scn() {
        return new Scanner(System.in);
    }

    public static void Staff() {
        String selection = "1";
        while (selection != null) {
            while (selection != null) {
                System.out.println("+----------------------------------+");
                System.out.println("| >1. Create order & print invoice |");
                System.out.println("| >2. Update order.                |");
                System.out.println("| >3. Log out.                     |");
                System.out.println("| >0. Exit app.                    |");
                System.out.println("+----------------------------------+");
                System.out.print(">Enter[0-3]: ");
                selection = scn().nextLine();

                switch (selection) {
                    case "1":
                        System.out.println("1");
                        break;
                    case "2":
                        System.out.println("2");
                        break;
                    case "3":
                        LoginIU.login();
                        break;
                    case "0":
                        selection = null;
                        break;
                    default:
                        System.out.println("Retry, please.\n");
                }
            }

        }
    }
    private static void createOrder(){

    }
    private static void printInvoice(int id){

    }
}
