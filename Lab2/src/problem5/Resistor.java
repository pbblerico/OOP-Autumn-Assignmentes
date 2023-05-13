package problem5;

public class Resistor extends Circuit {
	private double resistance;
	private double potentialDiff;
	
	public Resistor() {}
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}

	public double getResistance() {
		return this.resistance;
	}

	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
	}
}
