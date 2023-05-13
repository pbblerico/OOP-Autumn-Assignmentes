package problem5;


public class Person {
	private String name;
	private Gender gender;
	
	public Person() {}
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	public Person(Gender gender, String name) {
		this(gender);
		this.name = name;
	}
	public Gender getGender() {
		return this.gender;
	}
	
	public String toString() {
		return this.name + " " + this.gender + '\n';
	}
}

