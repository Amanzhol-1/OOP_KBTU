
public class Example1{
	
    public static void main(String[] args) {
 
		int denominator, numerator, ratio;
		numerator   = 6;
		denominator = 0;
	
		try {
			ratio = numerator / denominator;
			System.out.println("The answer is: " + ratio);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0.");
			e.printStackTrace();
		}
		 
		System.out.println("Done."); 
    }
}
     