package problem1;

public class Data {
	private double value;
	private double largest;
	private static int counter;
	
	public Data() {}
	
	public void addValue(double value) {
		this.value += value;
		counter++;
		findMax(value);
	}
	
	public void findMax(double value) {
		largest = (largest > value) ? largest : value;
	}
	
	public double getAverage() {
		if(counter == 0) return 0;
		return value / counter;
	}
	
	public double getLargest() {
		return largest;
	}
}

