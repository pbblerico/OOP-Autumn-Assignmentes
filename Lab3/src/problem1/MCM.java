package problem1;

public class MCM extends KBTUStudent implements CanCode, canUseDM{
	public MCM() {}
	
	public MCM(String id, String name) {
		super(id, name);
	}
	@Override
	public void code() {
		System.out.println("Coding");
	}

	@Override
	public void useGraphs() {
		System.out.println("study graphs");
	}

	@Override
	public void useNumberTheory() {
		System.out.println("number theory time");
	}
	
}
