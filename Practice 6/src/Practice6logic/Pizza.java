package Practice6logic;

public class Pizza {
    private static int weight = 1000; 

    public static void eatSlice(int amount) {
        if (weight - amount >= 0) {
            weight -= amount;
        } else {
            System.out.println("Not enough pizza left to eat this amount.");
        }
    }

    public static int getWeight() {
        return weight;
    }
}
