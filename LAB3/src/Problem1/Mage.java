package Problem1;

public class Mage extends Character implements Attacker {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }
    
    @Override
    public void attack(Character target) {
        System.out.println(name + " casts a spell on " + target.name);
    }
    
    @Override
    public String toString() {
        return "Mage: " + name + " with health " + health + " and mana " + mana;
    }
}
 