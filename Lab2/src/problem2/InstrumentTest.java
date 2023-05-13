package problem2;

import java.util.HashSet;

public class InstrumentTest {
	static HashSet <Instrument> inst;
	
	public static void main(String[] args) { 	
		inst = new HashSet <Instrument>();
		
		inst.add(new Guitar("guitar", "A22", 30.0, "acoustic", 6));
		inst.add(new Guitar("guitar", "A22", 30.0, "acoustic", 6));
		
		
		inst.add(new Guitar("guitar", "B23", 27.0, "acoustic", 6));
		inst.add(new Guitar("guitar", "A22", 30.0, "classical", 6));
		inst.add(new Guitar("guitar", "JUO0", 20.0, "ukulele", 6));
		inst.add(new Guitar("piano", "BHA5", 100.0, "acoustic", 7));
		inst.add(new Guitar("piano", "GHD2", 60.0, "acoustic", 5));
		
		for(Instrument in: inst) {
			System.out.println(in);
		}
		
		for(Instrument in: inst) {
			in.play();
		}
	}
}
