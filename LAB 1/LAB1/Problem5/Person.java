package Problem5;

public class Person {
	public Gender gender;
	public String name;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toSring() {
		return "Name: " + name + " Gender: " + gender;
	}
}
