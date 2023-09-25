
public class Student {
	public String studentName;
	public int studentID;
	public int	yaerOfStudentStudy;
	
	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.yaerOfStudentStudy = 1;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getYearOfStudentStudy() {
		return yaerOfStudentStudy;
	}
	
	public void increaseYearOfStudy() {
		yaerOfStudentStudy++;
	}
	
	public void GetInfoAboutStudent() {
		System.out.println("Student name: " + getStudentName());
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Student year of study: " + getYearOfStudentStudy());
	}
}
