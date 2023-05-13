package problem4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Vector;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee m = new Employee("K", 4343.0, LocalDate.of(2020, 1, 23), "2345");
		Employee m1 = (Employee) m.clone();
		
		Vector <Employee> v = new Vector <Employee>();
		
		v.add(m);
		v.add(new Employee("Absd", 3463, LocalDate.of(2021, 12, 24), "2342"));
		v.add(new Employee("Ndckd", 3463, LocalDate.of(2022, 1, 14), "2372"));
		v.add(new Employee("Csdf", 3463, LocalDate.of(2020, 2, 4), "42"));
		
//		for(Employee e: v) {
//			System.out.println(e);
//		}
		
		Collections.sort(v, new NameComparator());
//		m.setDate(LocalDate.of(2021, 2, 5));
//		System.out.println(m + "\n" + m1);
//		for(Employee e: v) {
//			System.out.println(e);
//		}
		Manager mm = new Manager("Ab", 3467, LocalDate.of(2020, 10, 23), "22");
		mm.addToTeam(v.get(0));
		mm.addToTeam(v.get(1));
		mm.addToTeam(v.get(2));
		Manager mm2 = (Manager) mm.clone();
		
		
		
		mm.addToTeam(v.get(3));
		
		Vector <Manager> v2 = new Vector <Manager>();
		
		v2.add(mm2);
		v2.add(mm);
		v2.add(new Manager("Bggh", 5568, LocalDate.of(2021, 3, 21), "343"));
		v2.add(new Manager("Bggh", 53238, LocalDate.of(2021, 3, 21), "343"));
		v2.add(new Manager("Bggh", 73568, LocalDate.of(2021, 3, 21), "343"));
		
		Collections.sort(v2);
		
		for(Manager ma: v2) {
			System.out.println(ma);
		}
		
//		System.out.println(mm);
	}
}
