abstract class BankAccount {
    String accountHolder;

    BankAccount(String name) {
        this.accountHolder = name;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

// Savings Account
class SavingsAccount extends BankAccount {
    private double balance;

    SavingsAccount(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Input");
        } else {
            balance += amount;
            System.out.printf("Amount deposited successfully. Updated Balance: %.2f%n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Input");
        } else {
            balance -= amount;
            System.out.printf("Amount withdrawn successfully. Updated Balance: %.2f%n", balance);
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double balance;

    CurrentAccount(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Input");
        } else {
            balance += amount;
            System.out.printf("Amount deposited successfully. Updated Balance: %.2f%n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Input");
        } else {
            balance -= amount;
            System.out.printf("Amount withdrawn successfully. Updated Balance: %.2f%n", balance);
        }
    }
}
