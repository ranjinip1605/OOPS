class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int a, String b, double c) {
        accountNumber = a;
        accountHolderName = b;
        balance = c;

BankAccount(int a,String b,Double c){
this.accountNumber = a;
this.accountHolderName = b;
this.balance = c;
}

void display(){
System.out.println("Enter the Account Number: "+accountNumber);
System.out.println("Enter the Account holder Name: "+accountHolderName);
System.out.println("Enter the balance: "+balance);
}
}
