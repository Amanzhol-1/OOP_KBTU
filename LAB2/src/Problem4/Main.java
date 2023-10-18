package Problem4;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savings1 = new SavingAccount(1, 10);
        CheckingAccount checking1 = new CheckingAccount(2);

        bank.openAccount(savings1);
        bank.openAccount(checking1);

        savings1.deposit(1000);
        checking1.deposit(2000);

        bank.update();
        savings1.transfer(1000, checking1);
        
        savings1.print();
        checking1.print();
        
        Lottery lottery = new Lottery(bank.getAccounts());
        lottery.awardPrize(); 
        
        savings1.print();
        checking1.print();
        
        bank.closeAccount(1);
        savings1.deposit(200);
        savings1.print();
    }
}
