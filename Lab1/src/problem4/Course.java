package problem4;

import java.util.Vector;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	Vector <Course> prerequisites;
	
	{
		prerequisites = new Vector <Course>();
	}
	
	Course() {}
	
	Course(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	Course(String name, String description, int numberOfCredits) {
		this(name, description);
		this.numberOfCredits = numberOfCredits;
	}
	
	Course(String name, String description, int numberOfCredits, Course prerequisite) {
		this(name, description, numberOfCredits);
		prerequisites.add(prerequisite);
	}
	public void addPrerequisite(Course prerequisite) {
		prerequisites.add(prerequisite);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getNumberOfCredits() {
		return this.numberOfCredits;
	}
	
	public String toString() {
		String prerequisite = new String();
		for(Course prereq: prerequisites) {
			prerequisite += prereq + " ";
		}
		return this.name + " " + this.description + " " + this.numberOfCredits + " " + prerequisite;
	}
}

