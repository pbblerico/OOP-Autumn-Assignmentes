package problem2;

public class Budgie extends Bird implements CanFly{
	String color;
	
	public Budgie() {}
	
	public Budgie(String name) {
		super(name);
	}
	
	public Budgie(String name, int age) {
		super(name, age);
	}
	
	public Budgie(String name, int age, double weight) {
		super(name, age, weight);
	}

	public void fly(Position pos) {
		System.out.println("Budgie " + super.getName() + " flies to " + pos);
		this.pos = pos;
	}
	
}
