class Employee {
    private String name;
    private int empId;
    private String workType;
    private double salary;   
    
    public void setname(String a) {
        this.name = a;
    }

    public void setempId(int b) {
        this.empId = b;
    }

    public void setworkType(String c) {
        this.workType = c;
    }

    public void setsalary(double d) {
        this.salary = d;
    }

    
    public String getname() {
        return name;
    }

    public int getempId() {
        return empId;
    }

    public String getworkType() {
        return workType;
    }

    public double getsalary() {
        return salary;
    }

    
    public void addBonus(double bonus) {
        if (bonus <= 0) {
            System.out.println("Invalid Input");
        } else {
            salary += bonus;
            System.out.printf("Bonus added successfully. Updated Salary: %.2f%n", salary);
        }
    }

    public void deductTax(double tax) {
        if (tax <= 0 || tax > salary) {
            System.out.println("Invalid Input");
        } else {
            salary -= tax;
            System.out.printf("Tax deducted successfully. Updated Salary: %.2f%n", salary);
        }
    }
    void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getname());
        System.out.println("Employee ID: " + getempId());
        System.out.println("Work Type: " + getworkType());
        System.out.printf("Salary: %.2f%n", getsalary());
    }
}