import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type (Savings or Current):");
        String type = sc.nextLine();

        System.out.println("Enter account holder name:");
        String name = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount acc;

        if (type.equals("Savings")) {
            acc = new SavingsAccount(name, balance);
        } else if (type.equals("Current")) {
            acc = new CurrentAccount(name, balance);
        } else {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter amount to deposit:");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);

        System.out.println("Enter amount to withdraw:");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);
    }
}
