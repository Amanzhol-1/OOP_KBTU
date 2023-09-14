import java.util.Scanner;

public class Problem6 {
	public static void isPalindrome(String text) {
		int cnt =  0; 
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
				cnt++;
			}
		}
		
		if (cnt == text.length()) {
			System.out.print("This text is palindrome");
		}
		else {
			System.out.print("This text is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Write Something: ");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		in.close();
		
		isPalindrome(text);
	}
}