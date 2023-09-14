import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		System.out.print("Write your wallet balance: ");
		Scanner in = new Scanner(System.in);
		float userBalance = in.nextInt();
		System.out.print("Write your interest rate: ");
		float interestRate = in.nextInt();
		in.close();
		
		System.out.print("New Balance: " + (userBalance + (userBalance * (interestRate / 100))));
	}
}
