package problem2;

import java.util.Objects;

public class Piano extends Instrument{
	String type;
	int numOfOctaves;
	
	public Piano() {}
	
	public Piano(String name, String model, double price, String type, int numOfOctaves) {
		super(name, model, price);
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getNumOfOctaves() {
		return this.numOfOctaves;
	}

	public String instrumentInfo() {
		return getType() + " " + getNumOfOctaves(); 
	}

	public void play() {
		System.out.println(getType() + " "+ super.getName() + " sounds");
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Piano p = (Piano) o;
		return this.type.equals(p.getType()) && this.numOfOctaves == p.getNumOfOctaves();
	}
	
	public int hashCode() {
		return Objects.hash(getName(), getModel(), getPrice(), type, numOfOctaves);
	}
}
