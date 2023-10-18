package Problem4;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.closeAccount();
                break;
            }
        }
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingAccount) {
                ((SavingAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFees();
            }
        }
    }
    
    public Vector<Account> getAccounts() {
        return accounts;
    }
}

