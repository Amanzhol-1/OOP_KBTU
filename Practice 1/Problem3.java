import java.util.Scanner;


public class Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int studentGrade = in.nextInt();
		
		if (studentGrade >= 95) {
			System.out.print("A");
		}
		else if (studentGrade < 95 && studentGrade >= 90) {
			System.out.print("A-");
		}
		else if (studentGrade < 90 && studentGrade >= 85) {
			System.out.print("B+");
		}
		else if (studentGrade < 85 && studentGrade >= 80) {
			System.out.print("B");
		}
		else if (studentGrade < 80 && studentGrade >= 75) {
			System.out.print("B-");
		}
		else if (studentGrade < 75 && studentGrade >= 70) {
			System.out.print("C+");
		}
		else if (studentGrade < 70 && studentGrade >= 65) {
			System.out.print("C");
		}
		else if (studentGrade < 65 && studentGrade >= 60) {
			System.out.print("C-");
		}
		else if (studentGrade < 60 && studentGrade >= 50) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
	}
}
