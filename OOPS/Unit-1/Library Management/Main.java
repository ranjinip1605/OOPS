import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Library []l = new Library [n];
    for(int i = 0; i < n; i++){
    System.out.println("Details of Book "+(i+1));
    String line = sc.nextLine();
    String arr[] = line.split(",");
    int a = Integer.parseInt(arr[0]);
    String b = arr[1];
    String c = arr[2];
    int d = Integer.parseInt(arr[3]);
    int e = Integer.parseInt(arr[4]);
    l[i] = new Library(a,b,c,d,e);
}
System.out.println("Book info");
for(int i = 0; i < n; i++){
l[i].displayLibrary();
}
}
}

