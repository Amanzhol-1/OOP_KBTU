package Problem4;

import java.util.Random;
import java.util.Vector;

public class Lottery {
    private Vector<Account> accounts; 
    private static final double PRIZE = 100000.0;

    public Lottery(Vector<Account> accounts) {
        this.accounts = accounts;
    }

    public void awardPrize() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available for the lottery.");
            return; 
        }

        Random random = new Random();
        int winningIndex = random.nextInt(accounts.size());

        Account winningAccount = accounts.get(winningIndex); 

        if (winningAccount.isActive()) {
            winningAccount.deposit(PRIZE);
            System.out.println("Account number " + winningAccount.getAccountNumber() + " has won the lottery! Prize of " + PRIZE + " has been deposited.");
        } else {
            System.out.println("Winning account is not active. No prize awarded.");
        }
    }
}
