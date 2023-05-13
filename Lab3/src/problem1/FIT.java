package problem1;

public class FIT extends KBTUStudent implements canUseDM, CanCode{
	public FIT() {}
	
	public FIT(String id, String name) {
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
