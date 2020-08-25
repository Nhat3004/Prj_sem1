package vn.edu.vtc.iu;

import vn.edu.vtc.bl.InvoiceBL;
import vn.edu.vtc.dal.InvoiceDAL;
import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.dal.StaffDAL;
import vn.edu.vtc.persistance.Drink;
import vn.edu.vtc.persistance.Invoice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static vn.edu.vtc.iu.ManagerIU.getByCode;

public class StaffIU {
    private static Scanner scn() {
        return new Scanner(System.in);
    }

    public static void Staff(int staffID) throws SQLException {
        int shopID = 1;
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
                        printInvoice(createOrder(staffID, shopID));
                        break;
                    case "2":
                        printInvoice(updateOrder());
                        break;
                    case "3":
                        LoginIU.login();
                        selection = null;
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

    private static int updateOrder() {
        int invoiceID;
        String code;

        boolean isExist = false, save = false, update = false;
        System.out.print("> Enter invoice ID to update: ");
        invoiceID = scn().nextInt();
        Invoice in = new Invoice();
        List<Drink> lst = new ArrayList<>();
        lst = InvoiceDAL.getInvoiceDetails(invoiceID);
        in = InvoiceDAL.getInvoiceByID(invoiceID);
        if (in == null) {
            System.out.println("Invoice doesn't exist.");
        } else {
            System.out.println("+------------------------------------------------------------------+");
            int i = 1;
            for (Drink drink : lst) {
                System.out.printf("| %2d| %-30s| %10.1f| %5d| %10.1f|\n", i, drink.getName(), drink.getUnitPrice(), drink.getQuantity(), drink.getAmount());
                i++;
            }
            System.out.println("+------------------------------------------------------------------+\n");
        }
        do {
            System.out.print("> Drink code: ");
            code = scn().nextLine();
            for (Drink dr : lst) {
                if (dr.getCode().equals(code)) {
                    System.out.print("> New quantity: ");
                    int temp, change;
                    temp = scn().nextInt();
                    change = temp - dr.getQuantity();
                    dr.setQuantity(temp);
                    update = InvoiceBL.updateInvoiceDetails(invoiceID, dr.getCode(), dr.getQuantity(), change);
                    isExist = true;
                }
            }
            if (update) {
                System.out.println("> Update successfully.");
            }
            if (!isExist) {
                System.out.println("> Drink code doesn't exist.");
            }

            String choice;
            System.out.print("> Enter [S,s] to save update/ other key update another new drink:");
            choice = scn().nextLine();
            if (choice.equals("S") || choice.equals("s")) {
                save = true;
            } else {
                save = false;
            }

        } while (!save);

        return invoiceID;
    }

    private static int createOrder(int staffID, int shopID) {
        int idInvoice = 1;
        boolean save = false;

        List<Drink> dr = new ArrayList<>();
        idInvoice = InvoiceBL.insertInvoice(staffID, shopID);
        do {
            String code;
            String choice;
            int quantity;
            boolean isExist, isExist2 = false;
            Drink drink = new Drink();
            do {
                System.out.print("> Drink code: ");
                code = scn().nextLine();
                Drink drink1 = getByCode(code);
                if (drink1.getCode() == null) {
                    System.out.println("> Drink isn't existed!");
                    isExist = false;
                } else {
                    isExist = true;
                }
            } while (!isExist);
            do {
                System.out.print("> Quantity: ");
                quantity = scn().nextInt();
            } while (quantity <= 0);
            for (Drink drr : dr) {
                if (drr.getCode().equals(code)) {
                    int temp;
                    temp = drr.getQuantity();
                    drr.setQuantity(temp + quantity);
                    isExist2 = true;
                }
            }
            if (!isExist2) {
                drink.setCode(code);
                drink.setQuantity(quantity);
                dr.add(drink);
            }

            System.out.print("> Enter [S,s] to save invoice/ other key add new drink:");
            choice = scn().nextLine();
            if (choice.equals("S") || choice.equals("s")) {
                save = true;
            } else {
                save = false;
            }
        } while (!save);
        for (Drink drr : dr) {
            InvoiceBL.insertInvoiceDetails(idInvoice, drr.getCode(), drr.getQuantity());
        }
        return idInvoice;
    }

    public static void printInvoice(int id) throws SQLException {
        Invoice in = new Invoice();
        List<Drink> lst = new ArrayList<>();
        in = InvoiceDAL.getInvoiceByID(id);
        if (in == null) {
            System.out.println("> Invoice doesn't exist.");
        } else {
            lst = InvoiceDAL.getInvoiceDetails(id);
            System.out.println("+------------------------------------------------------------------+");
            System.out.println(ShopDAL.getShopById(in.getShopId()));
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("|                          INVOICE                                 |");
            System.out.println("+------------------------------------------------------------------+");
            System.out.printf("> Invoice code: %d\n", in.getId());
            System.out.printf("> Date: %s.\n", in.getDate());
            System.out.printf("> Staff: %s, tel: %s.\n", StaffDAL.getStaffByID(id).getName(), StaffDAL.getStaffByID(id).getTel());
            System.out.println("+------------------------------------------------------------------+");
            int i = 1;
            double total = 0.0;
            for (Drink drink : lst) {
                System.out.printf("| %2d| %-30s| %10.1f| %5d| %10.1f|\n", i, drink.getName(), drink.getUnitPrice(), drink.getQuantity(), drink.getAmount());
                i++;
                total = total + drink.getAmount();
            }
            System.out.println("+------------------------------------------------------------------+");

            System.out.printf("|                                        Total: %16.1fVND|\n", total);
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("|                Get your laughing gear round this!                |");
            System.out.println("+------------------------------------------------------------------+\n\n\n");
        }

    }
}
