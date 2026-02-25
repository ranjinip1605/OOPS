import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Student []s = new Student[n];
    for(int i = 0; i < n; i++){
    System.out.println("Details of Student "+(i+1));
    String line = sc.nextLine();
    String arr[] = line.split(",");
    String a = arr[0];
    String b = arr[1];
    String c = arr[2];
    int d = Integer.parseInt(arr[3]);
    long e = Long.parseLong(arr[4]);
    long f = Long.parseLong(arr[5]);
    
    s[i] = new Student(a,b,c,d,e,f);
}
System.out.println("Student Info");
for(int i = 0; i < n; i++){
s[i].display();
}
}
}
