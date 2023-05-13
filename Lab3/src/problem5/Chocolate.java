package problem5;

public class Chocolate implements Comparable{
	private double weight;
	private String name;
	
	public Chocolate() {}
	
	public Chocolate(double weight) {
		this.weight = weight;
	}
	
	public Chocolate(double weight, String name) {
		this(weight);
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " weight: " + weight;
	}
	
	public int compareTo(Object o) {
		Chocolate c = (Chocolate) o;
		if(weight > c.getWeight()) return 1;
		if(weight == c.getWeight()) return 0;
		return -1;
	}

}
