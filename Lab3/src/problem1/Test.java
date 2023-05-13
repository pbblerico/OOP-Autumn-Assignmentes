package problem1;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		MCM m = new MCM("1235", "JF");
		FIT k2 = new FIT("334", "FDfd");
		ChemistryFac m1 = new ChemistryFac("d343", "dfdsf");
		
		m.code();
		k2.code();
		m1.studyChemistry();
		
		Vector <KBTUStudent> v = new Vector<KBTUStudent>();
		v.add(m);
		v.add(m1);
		v.add(k2);
		int i = 0;
		for(KBTUStudent k: v) {
			if(i % 2 == 1) k.getRetake();
			k.study();
			i++;
		}
	}
}
