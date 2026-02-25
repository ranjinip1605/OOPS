class Student{
    String name;
    String department;
    String address;
    int age;
    long regNo;
    long phoneNumber;
Student(String a, String b, String c, int d, long e, long f){
    this.name = a;
    this.department = b;
    this.address = c;
    this.age = d;
    this.regNo = e;
    this.phoneNumber = f;
}
void display(){
System.out.println("Enter the name of the student: "+name);
System.out.println("Name of the department: "+department);
System.out.println("Enter the residential address: "+address);
System.out.println("Enter the age: "+age);
System.out.println("Register number: "+regNo);
System.out.println("Phone number: "+phoneNumber);
}
}
