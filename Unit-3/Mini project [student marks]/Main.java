import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Exam Marks: ");
        int exam = sc.nextInt();

        System.out.print("Enter Assignment Marks: ");
        int assignment = sc.nextInt();

        System.out.print("Enter project Marks: ");
        int project = sc.nextInt();

        System.out.print("Enter Attendance Marks: ");
        int attendance = sc.nextInt();

        StudentEvaluation s = new StudentEvaluation(exam, assignment, project, attendance);

        s.calculateResult();
    }
}
