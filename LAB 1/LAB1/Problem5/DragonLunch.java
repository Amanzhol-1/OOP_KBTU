package Problem5;
import java.util.Vector;

public class DragonLunch {
	Vector <Person> kidnapped = new Vector <Person>();
	int couple;
	
	public void kidnap (Person p) {
		kidnapped.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int peoples = 0;
		for (Person p: kidnapped) {
			if (p.gender == Gender.BOY) peoples++;
			else {
				if (peoples == 0) {
					return false;
				} //BBGG
				else {
					peoples--;
					couple++;
				}
			}
		}
		if (couple * 2 == kidnapped.size()) return true;
		else return false;
	}
	
	public String toString() {
		if (willDragonEatOrNot() == true) {
			return "The dragon didn't have lunch today";
		}
		else {
			return "Oh, no .... The dragon ate";
		}
	}
	
}
