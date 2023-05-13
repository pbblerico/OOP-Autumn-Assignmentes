package problem4;

public abstract class Person {
	private String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "name: " + name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Person p = (Person) o;
		
		return name.equals(p.getName());
	}
}
