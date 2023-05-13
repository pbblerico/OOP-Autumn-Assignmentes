package problem5;

public class Series extends Circuit {
	Circuit a, b;
	
	public Series() {}
	
	public Series(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}

	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}

	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff();
	}

	public void applyPotentialDiff(double V) {
		double i = V / getResistance();
		a.applyPotentialDiff(i * a.getResistance());
		b.applyPotentialDiff(i * b.getResistance());
	}
	
}
