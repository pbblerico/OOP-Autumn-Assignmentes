package problem2;

public class Penguin extends Bird implements CanSwim {
	public Penguin() {}
	
	public Penguin(String name) {
		super(name);
	}
	
	public Penguin(String name, int age) {
		super(name, age);
	}
	
	public Penguin(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	public void swim(Position pos) {
		System.out.println("Penguin " + super.getName() + " swims to " + pos);
		this.pos = pos;
	}
}
