package problem2;

import java.util.Objects;

public abstract class Instrument {
	private String name;
	private String model;
	private double price;
	
	public Instrument() {}
	
	public Instrument(String name, String model, double price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public abstract String instrumentInfo();
	
	public abstract void play();
	
	public String getName() {
		return this.name;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return name + " " + model + " " + price + " " + instrumentInfo();
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Instrument ins = (Instrument) o;
		return this.name.equals(ins.getName()) && this.model.equals(ins.getModel()) && this.price == ins.getPrice();
 	}
	
	public int hashCode() {
		return Objects.hash(name, model, price);
	}
}
