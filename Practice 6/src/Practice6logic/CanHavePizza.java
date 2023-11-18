package Practice6logic;

public interface CanHavePizza {
    void eatPizza();
    default void pizzaWeight() {
        System.out.println("Pizza weight left: " + Pizza.getWeight());
    }
}
