import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String a = sc.nextLine();

        System.out.println("Enter employee ID:");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Work Type:");
        String c = sc.nextLine();

        System.out.println("Enter basic salary:");
        double d = sc.nextDouble();

        Employee e = new Employee();
        e.setname(a);
        e.setempId(b);
        e.setworkType(c);
        e.setsalary(d);

        e.display();

        System.out.println("Enter bonus amount:");
        double bonus = sc.nextDouble();
        e.addBonus(bonus);

        System.out.println("Enter tax amount:");
        double tax = sc.nextDouble();
        e.deductTax(tax);

        e.display();
    }
}
