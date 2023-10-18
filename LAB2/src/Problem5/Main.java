package Problem5;

public class Main {
	
	public static void main(String[] args) {
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h,f);
		double R = circuit.getResistance();
		System.out.println("Total Resistance: " + R); 
		System.out.println("Total Current: " + circuit.getCurrent());
		System.out.println("Total Power: " + circuit.getPower());
		circuit.applyPotentialDiif(220);
		System.out.println("Total Resistance after applying potential difference: " + R);
        System.out.println("Total Current after applying potential difference: " + circuit.getCurrent());
        System.out.println("Total Power after applying potential difference: " + circuit.getPower());
	} 
} 