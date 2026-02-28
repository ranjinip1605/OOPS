interface EmployeeManagement{
    public void displayEmployee();
}
class Staff implements EmployeeManagement{
    String name;
    int employeeId;
    String shift;
    Staff(String name,int employeeId,String shift){
        this.name = name;
        this.employeeId = employeeId;
        this.shift = shift;
    }
public void displayEmployee(){
    System.out.println("Employee name: "+name);
    System.out.println("Employee ID: "+employeeId);
    System.out.println("Shift (Day/Night): "+shift);
   }
}