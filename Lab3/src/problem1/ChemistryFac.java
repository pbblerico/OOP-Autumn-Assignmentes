package problem1;

public class ChemistryFac extends KBTUStudent implements knowsChemistry{
	public ChemistryFac() {}
	
	public ChemistryFac(String id, String name) {
		super(id, name);
	}

	@Override
	public void studyChemistry() {
		System.out.println("Chemistry time");
	}
}
