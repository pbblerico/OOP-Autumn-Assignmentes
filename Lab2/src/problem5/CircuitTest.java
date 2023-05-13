package problem5;

public class CircuitTest {
	public static void main(String[] args) {
		Circuit a = new Resistor(3);
		Circuit b = new Resistor(3);
		Circuit c = new Resistor(6);
		Circuit d = new Resistor(3);
		Circuit e = new Resistor(2);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		
		System.out.println(circuit.getResistance());
	}
}
