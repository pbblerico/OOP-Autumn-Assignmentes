package problem5;

public class Parallel extends Circuit{
	Circuit a, b;
	
	public Parallel() {}
	
	public Parallel(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	public double getResistance() {
		return (a.getResistance() * b.getResistance()) / (a.getResistance() + b.getResistance());
	}

	public double getPotentialDiff() {
		return a.getPotentialDiff();
	}

	public void applyPotentialDiff(double V) {
		a.applyPotentialDiff(V);
		b.applyPotentialDiff(V);
	}

}
