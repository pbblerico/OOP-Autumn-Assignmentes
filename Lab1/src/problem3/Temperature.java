package problem3;


public class Temperature {
	private char scale;
	private double value;
	
	public Temperature() {
		scale = 'C';
		value = 0;
	}
	
	public Temperature(char scale) {
		this.scale = scale;
	}
	
	public Temperature(double value) {
		this.scale = 'C';
		this.value = value;
	}
	
	public Temperature(char scale, double value) {
		this(scale);
		this.value = value;
	}
	
	void setValue(double value) {
		this.value = value;
	}
	
	void setScale(char scale) {
		if(this.scale != scale) {
			if(scale == 'C') this.value = degreesC();
			else this.value = degreesF();
		}
		this.scale = scale;
	}
	
	void setValueScale(double value, char scale) {
		setScale(scale);
		setValue(value);
	}
	
	public double degreesC() {
		if(this.getScale() == 'C') return this.value;
		double degreeC = 5 * (this.value - 32) / 9;
		return degreeC;
	}
	
	public double degreesF() {
		if(this.getScale() == 'F') return this.value;
		double degreeF = 9 * (this.value / 5) + 32;
		return degreeF;
	}
	
	public char getScale() {
		return this.scale;
	}
	
	public String toString() {
		String review = "" + ((this.getScale() == 'C') ? this.degreesC() : this.degreesF()) + " " + this.getScale(); 
		return review;
	}
}

