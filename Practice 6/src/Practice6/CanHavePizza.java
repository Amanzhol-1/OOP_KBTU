package Practice6;

public interface CanHavePizza {
    static final int WEIGHT = 1000;

    void eatPizza();

    default void pizzaWeight() {
        System.out.println(WEIGHT);
    }
} 
  