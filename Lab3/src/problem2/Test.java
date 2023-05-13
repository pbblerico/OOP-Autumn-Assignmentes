package problem2;

public class Test {
	public static void main(String[] args) {
		Budgie bud = new Budgie("Kesha");
		bud.fly(new Position(2, 3));
		
		Bird b = bud;
		b.move(new Position(4, 2));
		System.out.println(b);
		
		Penguin p = new Penguin("Rico");
		p.swim(new Position(4, 7));
		
		Bird b1 = p;
		b1.move(new Position(3, 6));
	}
}
