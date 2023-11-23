package Problem1;

public class Game {
    public static void main(String[] args) {
        Mage mage = new Mage("Gandalf", 100, 200);
        Warrior warrior = new Warrior("Aragorn", 150, 50);
        
        System.out.println(mage.toString());
        System.out.println(warrior.toString());
        
        mage.attack(warrior);
        warrior.attack(mage); 
    }
}
 