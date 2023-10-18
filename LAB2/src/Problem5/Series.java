package Problem5;

public class Series extends Circuit{

	Circuit first;
	Circuit second;
	public Series(Circuit a, Circuit b) {
		this.first = a;
		this.second = b;
	}
	
	@Override
	public double getResistance() {
		return first.getResistance() + second.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return first.getPotentialDiff() + second.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiif(double V) {
		first.applyPotentialDiif(V); 
	}

} 