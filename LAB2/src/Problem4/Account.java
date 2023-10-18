package Problem4;

public class Account {
    private double balance;
    private final int accNumber;
    private boolean isActive;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
        isActive = true;
    }

    public void deposit(double sum) {
        if (isActive) {
            balance += sum; 
        } else {
            System.out.println("Cannot perform operation: account is closed.");
        }
    }

    public void withdraw(double sum) {
        if (isActive && balance >= sum) {
            balance -= sum;
        } else {
            System.out.println("Cannot perform operation: account is closed or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void closeAccount() {
        isActive = false;
    } 

    public void transfer(double amount, Account other) {
        if (amount > 0 && balance >= amount && isActive && other.isActive) {
            withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Transfer failed: One of the accounts is closed or insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "Acc " + accNumber + ": " + "balance = " + balance;
    }

    public final void print() {
        System.out.println(this.toString());
    }
} 
