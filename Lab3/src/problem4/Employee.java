package problem4;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person implements Comparable <Employee>, Cloneable{
	private double salary;
	private LocalDate hireDate;
	String insuranceNumber;
	
	public Employee() {}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public Employee(String name, double salary, LocalDate hireDate, String ins) {
		this(name, salary);
		this.hireDate = hireDate;
		this.insuranceNumber = ins;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public LocalDate getDate() {
		return hireDate;
	}
	
	public void setDate(LocalDate date) {
		hireDate = date;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public String toString() {
		return super.toString() + " salary: " + salary + " hire date: " + hireDate + " nat. insurance num: " + insuranceNumber;
	}
		
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Employee e = (Employee) o;
		
		return salary == e.getSalary() && hireDate.equals(e.getDate()) && insuranceNumber.equals(e.getInsuranceNumber());
	}

	public int compareTo(Employee o) {
		if(salary > o.getSalary()) return 1;
		if(salary == o.getSalary()) return 0;
		return -1;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = this.hireDate;
		return e;
	}
}	
