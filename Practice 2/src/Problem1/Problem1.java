
public class Problem1 {

	public static void main(String[] args) {
		
		Student student = new Student("Amanzhol", 1);
		
		student.GetInfoAboutStudent();
		
		student.increaseYearOfStudy();
		
		System.out.println("----------------------------");
		
		student.GetInfoAboutStudent();
	}

}
