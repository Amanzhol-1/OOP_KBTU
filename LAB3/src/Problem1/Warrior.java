package Problem1;

public class Warrior extends Character implements Attacker {
    private int stamina;

    public Warrior(String name, int health, int stamina) {
        super(name, health);
        this.stamina = stamina;
    }
    
    @Override
    public void attack(Character target) {
        System.out.println(name + " swings a sword at " + target.name);
    }
    
    @Override
    public String toString() {
        return "Warrior: " + name + " with health " + health + " and stamina " + stamina;
    }
}
 