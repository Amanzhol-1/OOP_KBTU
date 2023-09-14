import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int d = (b * b) - (4 * a * c);
		
		if (d < 0) {
			System.out.print("Discriminant less than 0 ");
		}
		else {
			System.out.println("x1 = " + (((-b + Math.sqrt(d)))) / (2 * a));
			System.out.print("x2 = " + (((-b - Math.sqrt(d)))) / (2 * a));
		}
	}
}
