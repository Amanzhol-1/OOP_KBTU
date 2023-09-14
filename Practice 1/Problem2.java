import java.util.Scanner; 

public class Problem2 {
	public static void main(String[] args) {
		System.out.print("Square side: ");
		Scanner in = new Scanner(System.in);
		int squareSide = in.nextInt();
		in.close();
		
		System.out.println("Area = " + squareSide * squareSide);
		System.out.println("Perimeter = " + 4 * squareSide);
		System.out.println("Length Of Diagonal = " + Math.sqrt(2 * (squareSide * squareSide)));
	}
}
