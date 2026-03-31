import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        while(true) {

            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Product p = new Product(id, name, qty, price);
                    inv.addProduct(p);
                    break;

                case 2:
                    inv.viewProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int sid = sc.nextInt();
                    inv.searchProduct(sid);
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();

                    inv.updateQuantity(uid, newQty);
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    int did = sc.nextInt();
                    inv.deleteProduct(did);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
