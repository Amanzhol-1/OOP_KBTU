package Problem2;

import java.util.Objects;

public class Mage extends Hero{
	private int mana;
	
	public Mage() {
		
	}
	
	public Mage(String name, int level, int mana) {
		super(name, level);
		this.mana = mana;
	}
	
	@Override
	public void attact() {
		System.out.println(name + " casts a spell on the enemy!");
	}
	
	@Override 
	public boolean equals(Object object) {
		if (!super.equals(object)) return false;
		Mage mage = (Mage) object;
		return mana == mage.mana; 
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), mana); 
	}
}
