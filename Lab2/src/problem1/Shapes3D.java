package problem1;

public abstract class Shapes3D {
	private String material;
	private String color;
	private boolean hollow;
	
	{
		this.material = "plastic";
		this.color = "white";
	}
	
	public Shapes3D() {}

	public Shapes3D(String material, String color, boolean hollow) {
		this.material = material;
		this.color = color;
		this.hollow = hollow;
	}
	
	public abstract double volume();
	
	public abstract double surfaceArea();
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean isHollow() {
		return this.hollow;
	}
	
	public boolean isWhite() {
		return this.color == "white";
	}
	
	public String setColor(String color) {
		if(isWhite()) {
			this.color = color;
			return "base color was changed";
		}
		return "we can't change the color isn't base";
	}
	
	public String returnFormated(int format, double value) {
		String formatting = "%,." + format + "f";
		return String.format(formatting, value);
	}
	
	public String returnFormated(double value) {
		return String.format("%,.2f", value);
	}
	
	public String toString() {
		return this.material + " " + this.color + " " + this.hollow + " " + this.returnFormated(this.volume()) + " " + this.returnFormated(surfaceArea());
	}
}
	
