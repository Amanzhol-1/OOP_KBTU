package Problem4;
import test.Student;

public class testGradeBook {

	public static void main(String[] args) {
		GradeBook book = new GradeBook();
		
		book.addStudent("A", 87);
		book.addStudent("B", 68);
		book.addStudent("C", 94);
		book.addStudent("D", 100);
		book.addStudent("E", 83);
		book.addStudent("F", 78);
		book.addStudent("G", 85);
		book.addStudent("H", 91);
		book.addStudent("I", 76);
		book.addStudent("J", 87);
		
		book.dispayMessage();
		System.out.print(book.gradeReport());
		book.outputBarChat();
	}

}
