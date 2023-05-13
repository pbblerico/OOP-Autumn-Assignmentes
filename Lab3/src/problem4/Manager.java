package problem4;

import java.time.LocalDate;
import java.util.Vector;

public class Manager extends Employee {
	private Vector <Employee> team;
	private double bonus;
	
	{
		team = new Vector <Employee>();
		bonus = 0;
	}
	
	public Manager() {}
	
	public Manager(String name) {
		super(name);
	}
	
	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	public Manager(String name, double salary, LocalDate hireDate, String ins) {
		super(name, salary, hireDate, ins);
	}
	
	public void addToTeam(Employee e) {
		team.add(e);
		bonus += 100;
	}
	
	public void removeFromTeam(Employee e) {
		if(team.contains(e)) bonus -= 100;
		team.remove(e);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public String toString() {
		return super.toString() + "\n" + team;
	}
	
	public int compareTo(Manager o) {
		int parentCheck = super.compareTo(o);
		if(parentCheck != 0) {
			return parentCheck;
		}
		if(bonus > o.getBonus()) return 1;
		if(bonus == o.getBonus()) return 0;
		return -1;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.team = new Vector<Employee>(team);
		return m;
	}
}
