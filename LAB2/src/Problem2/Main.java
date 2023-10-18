package Problem2;

import java.util.HashSet;

public class Main{
	public static void main(String[] args) {
		HashSet<Hero> heroes = new HashSet<>(); 
		
        heroes.add(new Hero("Knight", 1));
        heroes.add(new Mage("Wizard", 2, 100));

        if (!heroes.add(new Mage("Wizard", 2, 100))) {
        	System.out.println("Duplicate found!");
        }
        
        for (Hero hero : heroes) {
        	hero.attact();
        }
	}
} 