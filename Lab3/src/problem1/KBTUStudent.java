package problem1;

public abstract class KBTUStudent {
	private String id;
	String name;
	String department;
	double gpa;
	
	public KBTUStudent() {}
	
	public KBTUStudent(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void study() {
		System.out.println("Student " + id + " studies");
	}
	
	public void getRetake() {
		System.out.println("Retake is taken by " + id);
	}
	
	public String toString() {
		return id + " " + name + " " + department;
	}
}
