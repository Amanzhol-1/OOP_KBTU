package Problem5;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiif(double V);
	public double getPower() {
		return (getPotentialDiff() * getPotentialDiff())/getResistance();
	}
	
	public double getCurrent() {
		return getPotentialDiff()/getResistance();
	}
} 