import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Date date = new Date();

		Scanner in = new Scanner(System.in);

		System.out.println("White number (Q to quit): ");

		while (in.hasNextDouble()) {
			date.satValuesToDate(in.nextDouble());
		}
		
		in.close();
		System.out.print(date.toString());
	}

}
