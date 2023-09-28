package Problem5;

public class Problem5 {

	public static void main(String[] args) {
		DragonLunch lunch = new DragonLunch();
		Person Student1 = new Person(Gender.BOY);
		Person Student2 = new Person(Gender.BOY);
		Person Student3 = new Person(Gender.GIRL);
		Person Student4 = new Person(Gender.GIRL);
		
		lunch.kidnap(Student1);
		lunch.kidnap(Student2);
		lunch.kidnap(Student3);
		lunch.kidnap(Student4);
		
		System.out.print(lunch.toString());
	}

}
