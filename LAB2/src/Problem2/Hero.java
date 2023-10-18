package Problem2;

import java.util.Objects;

public class Hero{
	protected String name;
	protected int level;
	
	public Hero() {
		
	}
	
	public Hero(String name, int level) {
		this.name = name;
		this.level = level;
	} 
	
	@Override 
	public boolean equals(Object object) {
		if (object == this) return true;
		if (object == null) return false;
		if (this.getClass() != object.getClass()) return false; 
		Hero hero = (Hero) object;
		return level == hero.level && Objects.equals(name, hero.name);  
	} 

    @Override
    public int hashCode() {
    	return Objects.hash(name, level);
    } 
    
    public void attact() {
    	System.out.println(name + " attacks the enemy!");
    } 
}
