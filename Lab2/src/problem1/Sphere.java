package problem1;

public class Sphere extends Shapes3D {
	private double radius;
	
	{
		radius = 1;
	}
	
	public Sphere() {}
	
	public Sphere(String material, String color, boolean hollow, double radius) {
		super(material, color, hollow);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public double volume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return super.toString() + " " + this.radius;
	}
}
