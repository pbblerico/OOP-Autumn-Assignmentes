package problem1;

public class Cube extends Shapes3D {
	private double side;
	
	{
		side = 1;
	}
	
	public Cube() {}
	
	public Cube(String material, String color, boolean hollow, double side) {
		super(material, color, hollow);
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}

	public double volume() {
		return Math.pow(this.side, 3);
	}
	
	public double cubeDiagonal() {
		return Math.sqrt(3) * this.side;
	}

	public double surfaceArea() {
		return 6 * Math.pow(this.side, 2);
	}
	
	public String toString() {
		return super.toString() + " " + this.side + " " + super.returnFormated(this.cubeDiagonal());
	}
}
