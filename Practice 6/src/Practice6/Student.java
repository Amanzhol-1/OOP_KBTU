package Practice6;

public class Student implements CanHavePizza, Speak {
    private String name;
    private int pweight = WEIGHT;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eatPizza() {
        if (pweight > 0) {
            pweight = pweight - 200;
            System.out.println("Student " + name + " is eating pizza.");
        } else {
            System.out.println("No more pizza left for " + name);
        }
    }

    @Override
    public void pizzaWeight() {
        System.out.println("Pizza weight left: " + pweight);
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
