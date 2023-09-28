package Problem4;
import test.Student;
import java.util.Vector; 

public class GradeBook {
	Vector <Student> students = new Vector<Student>(); 
	public int studentID = 1;
	public int average = 0;
	public double cnt = 0;
	public double max = Integer.MIN_VALUE;
	public double min = Integer.MAX_VALUE;
	
	String nameMaxStudent;
	String nameMinStudent;
	
	public void addStudent(String studentName, int studentGrade) {
		students.add(new Student(studentName, studentGrade, studentID));
		studentID++;
		cnt++;
		
	}
	
	public void dispayMessage () {
		System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!" + "\n");
	}
	
	public double determineClassAverage() {
		for (Student student: students) {
			average += student.getStudentGrade();
		}
		return average / cnt;
	}
	
	public String determineHighestGrade() {
		for (Student student: students) {
			if (student.getStudentGrade() > max) {
				max = student.getStudentGrade();
				nameMaxStudent = student.getStudentName();
			}
		}
		return nameMaxStudent + " " + max;
	}
	
	public String determineLowestGrade() {
		for (Student student: students) {
			if (student.getStudentGrade() < min) {
				min = student.getStudentGrade();
				nameMinStudent = student.getStudentName();
			}
		}
		return nameMinStudent + " " + min;
	}
	
	public void outputBarChat() {
		System.out.println("Grades distribution: ");
		for (int i = 0; i < 100; i+= 10) {
			String star = "";
			for (Student student: students) {
				if (student.getStudentGrade() >= i && student.getStudentGrade() <= 9 + i) {
					star += "*"; 
				}
			}
			System.out.print(i + "-" + (i + 9)+ ":"+ star + "\n");
		}
		String star = "";
		
		for (Student student: students) {
			if (student.getStudentGrade() == 100) {
				star += "*";
			}
		}
		System.out.println(100 + ":" + star);
	}
	
	public String gradeReport() { 
		String answer = "Class average is " + determineClassAverage() + ". Lowest grade is (" + determineLowestGrade() + ") \n" + "Highest grade is (" + determineHighestGrade() + ") \n" + "\n";
		return answer;
	}
	
	
}
