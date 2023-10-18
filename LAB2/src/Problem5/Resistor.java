package Problem5;

public class Resistor extends Circuit{
	
	private double resistance;
	private double potentialDiff;

	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	@Override
	public double getResistance() {
		return this.resistance;
	}

	@Override
	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	@Override
	public void applyPotentialDiif(double V) {
		this.potentialDiff = V;
		
	}

}