import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select tracking option:");
        System.out.println("1. Track by Vehicle Number");
        System.out.println("2. Track by Owner Name");
        System.out.println("3. Track by Owner Name and Vehicle Type");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();
        sc.nextLine();

        Vehicle v = new Vehicle();

        if (choice == 1) {
            System.out.print("Enter Vehicle Number: ");
            int number = sc.nextInt();
            v.trackVehicle(number);
        }
        else if (choice == 2) {
            System.out.print("Enter Owner Name: ");
            String name = sc.nextLine();
            v.trackVehicle(name);
        }
        else if (choice == 3) {
            System.out.print("Enter Owner Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Vehicle Type (Car/Bike): ");
            String type = sc.nextLine();
            v.trackVehicle(name, type);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}

