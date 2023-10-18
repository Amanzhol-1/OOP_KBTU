package Problem4;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int a, double interestRate) {
        super(a);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        if (isActive()) {
            double interest = getBalance() * (interestRate / 100.0);
            deposit(interest);
        } else {
            System.out.println("Cannot add interest: account is closed.");
        }
    }
}
