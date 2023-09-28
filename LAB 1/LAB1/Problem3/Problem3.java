package Problem3;

public class Problem3 {

	public static void main(String[] args) {
		Temperature p3 = new  Temperature();
		p3.setTemperature(29);
		p3.setScale("C");
		
		p3.Fahrenheit();
		System.out.print(p3.toString());
	}
}
