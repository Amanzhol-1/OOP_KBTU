package Practice6logic;

public class Student implements CanHavePizza, Speak {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eatPizza() {
        Pizza.eatSlice(200);
        System.out.println("Student " + name + " is eating pizza.");
    }

    @Override
    public void speak() {
        System.out.println(name + ": I'm speaking.");
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
