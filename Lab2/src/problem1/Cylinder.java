package problem1;

public class Cylinder extends Shapes3D{
	private double radius;
	private double height;
	
	{
		this.radius = 1;
		this.height = 1;
	}
	
	public Cylinder() {}
	
	public Cylinder(String material, String color, boolean hollow, double radius) {
		super(material, color, hollow);
		this.radius = radius;
	}
	
	public Cylinder(String material, String color, boolean hollow, double radius, double height) {
		this(material, color, hollow, radius);
		this.height = height;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getHeight() {
		return this.radius;
	}

	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	public double curvedSurfaceArea() {
		return 2 * Math.PI * this.radius * this.height; 
	}
	
	public double baseArea() {
		return 2 * Math.PI * Math.pow(this.radius, 2);
	}
	
	public String toString() {
		return super.toString() + " " + this.radius + " " + this.height + " " + super.returnFormated(this.baseArea()) + " " + super.returnFormated(this.curvedSurfaceArea());
	}
}
