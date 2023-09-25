package Problem3;

public class Problem3 {

	public static void main(String[] args) {
		Time t1 = new Time(23, 5, 6);
		System.out.println(t1.toUniversalFormat());
		System.out.println(t1.toStandardFormat());
		
		System.out.println("----------------------------");
		
		Time t2 = new Time(4, 20, 33);
		t1.add(t2);
		System.out.println(t1.toUniversalFormat());
		System.out.println(t1.toStandardFormat());
		
	}

}
