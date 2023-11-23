package Problem5;

public class Chocolate implements Comparable<Chocolate> {
    private int weight;
    private String name;

    public Chocolate(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
