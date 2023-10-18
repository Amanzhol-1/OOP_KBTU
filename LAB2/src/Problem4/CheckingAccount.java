package Problem4;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int a) {
        super(a);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFees() {
        if (isActive()) { 
            if (transactionCount > FREE_TRANSACTIONS) {
                double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
                if (getBalance() >= fees) {
                    withdraw(fees);
                } else {
                    System.out.println("Not enough funds to cover the fees.");
                }
                transactionCount = 0;
            }
        } else {
            System.out.println("Cannot deduct fees: account is closed."); 
        }
    }
}

