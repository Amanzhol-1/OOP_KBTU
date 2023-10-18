package Problem1B;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<LibraryItem> libatyIteam = new Vector<>();
		
		libatyIteam.add(new Book("Discourse on the Method", "Rene Descartes", 1637, 414));
		libatyIteam.add(new Book());
		
		for (LibraryItem libatyItem : libatyIteam) {
			System.out.println(libatyItem.toString());
		}
	}

}
