package Problem5;

public class Parallel extends Circuit{

	Circuit first;
	Circuit second;
	public Parallel(Circuit a, Circuit b) {
		this.first = a;
		this.second = b;
	}
	
	@Override
	public double getResistance() {
		return Math.pow(1/first.getResistance() + 1/second.getResistance(), -1);
	}

	@Override
	public double getPotentialDiff() {
		return first.getPotentialDiff();
	}

	@Override 
	public void applyPotentialDiif(double V) {
		first.applyPotentialDiif(V);
		second.applyPotentialDiif(V);
	}

}  