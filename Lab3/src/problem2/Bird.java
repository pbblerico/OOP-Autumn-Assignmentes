package problem2;

public class Bird implements Moveable {
	String name;
	int age;
	double weight;
	protected Position pos;
	
	{
		pos = new Position();
	}
	
	public Bird() {}

	public Bird(String name) {
		this.name = name;
	}
	
	public Bird(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public Bird(String name, int age, double weight) {
		this(name, age);
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public final void move(Position pos) {
		System.out.println("birdie " + name + " goes to " + pos);
		this.pos = pos;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public String toString() {
		return name + " " + age + " " + weight + " " + pos;
	}
}
