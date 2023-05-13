package problem5;

import java.time.LocalDate;

import practice2.Time;
import problem4.Employee;
public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Chocolate[] ch = new Chocolate[6];
		ch[0] = new Chocolate(14);
		ch[1] = new Chocolate(10);
		ch[2] = new Chocolate(3);
		ch[3] = new Chocolate(3);
		ch[4] = new Chocolate(4);
		ch[5] = new Chocolate(1);
		
		Sort s = new Sort();
		Sort.heapSort(ch);
		for(Chocolate c: ch) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Employee[] em = new Employee[6];
		em[0] = new Employee("And",34367, LocalDate.of(2019, 12, 4), "3567");
		em[1] = new Employee("Nevk",68330, LocalDate.of(2016, 1, 30), "3607");
		em[2] = new Employee("Beck",65467, LocalDate.of(2020, 11, 15), "5467");
		em[3] = new Employee("Mick",53867, LocalDate.of(2021, 5, 12), "w67");
		em[4] = new Employee("Knr", 6367, LocalDate.of(2020, 10, 4), "3567");
		em[5] = new Employee("Vexls",46367, LocalDate.of(2010, 10, 21), "3567");
		
		Sort.quickSort(em, 0, 5);
		for(Employee e: em) {
			System.out.println(e);
		}
		
		Time[] t = new Time[6];
		t[0] = new Time(10, 34, 24);
		t[1] = new Time(1, 4, 24);
		t[2] = new Time(12, 54, 16);
		t[3] = new Time(6, 12, 24);
		t[4] = new Time(7, 8, 16);
		t[5] = new Time(8, 49, 32);
		
		Sort.quickSort(t, 0, 5);
		for(Time ti: t) {
			System.out.println(ti);
		}
	}
}
