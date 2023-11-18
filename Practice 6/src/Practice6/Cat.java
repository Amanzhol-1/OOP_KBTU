package Practice6;

public class Cat implements CanHavePizza {
    private String name;
    private int pweight = WEIGHT;

    public Cat() {
        this.name = "Unknown";
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eatPizza() {
        if (pweight > 0) {
            pweight = pweight - 10; 
            System.out.println("Cat " + name + " is eating pizza.");
        } else {
            System.out.println("No more pizza left for " + name);
        }
    } 
 
    @Override
    public void pizzaWeight() {
        System.out.println("Pizza weight left: " + pweight);
    }
 
    @Override
    public String toString() {
        return "Cat: " + name;
    }
}
 