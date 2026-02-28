import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int employeeId = sc.nextInt();
        sc.nextLine();
        String shift = sc.nextLine();
        
        System.out.print("Enter Employee name: ");
        System.out.print("Enter Employee ID: ");
        System.out.print("Enter whether Day/Night shift: ");
        System.out.println("Employee Details:");
        EmployeeManagement e = new Staff(name,employeeId,shift);
        e.EmployeeManagement();
    }
}