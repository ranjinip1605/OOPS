import java.io.*;
import java.util.*;

public class Main{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
BankAccount y = new BankAccount();

for(int i=0;i<n;i++){
System.out.println("Bank Details "(i+1));
int a = sc.nextInt();
String b = sc.nextLine();
double d = sc.nextDouble();
y[i] = new BankAccount(a,b,c);
}

for(int i=0;i<n;i++){
y[i].display();
}
}
}
