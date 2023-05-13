package problem2;

import java.util.Objects;

public class Guitar extends Instrument{
	String type;
	int numOfStrings;
	
	public Guitar() {}
	
	public Guitar(String name, String model, double price, String type, int numOfStrings) {
		super(name, model, price);
		this.type = type;
		this.numOfStrings = numOfStrings;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void play() {
		System.out.println(getType() + " "+ super.getName() + " sounds");
	}
	
	public int getNumOfStrings() {
		return this.numOfStrings;
	}
	
	public String instrumentInfo() {
		return getType() + " " + getNumOfStrings(); 
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Guitar g = (Guitar) o;
		return this.type.equals(g.getType()) && this.numOfStrings == g.getNumOfStrings();
	}
	
	public int hashCode() {
		return Objects.hash(getName(), getModel(), getPrice(), type, numOfStrings);
	}
}
