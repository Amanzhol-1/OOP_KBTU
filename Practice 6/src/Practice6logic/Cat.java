package Practice6logic;

public class Cat implements CanHavePizza {
    private String name;

    public Cat() {
        this.name = "Unknown";
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eatPizza() {
        Pizza.eatSlice(10);
        System.out.println("Cat " + name + " is eating pizza.");
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}
