package problem4;
import java.util.Vector;

import practice2.Student;

public class GradeBook {
	Vector <Student> studentList;
	Vector <Double> gradeList;
	Course course;
	private int lowestGradeIndex;
	private int highestGradeIndex;
	private double gradeSum;
	int[] gradeDistribution;
	
	{
		studentList = new Vector <Student>();
		gradeList = new Vector <Double>();
		gradeDistribution = new int[11];
	}
	
	public GradeBook() {}
	
	public GradeBook(Course course) {
		this.course = course;
	}
	
	public void addStudent(Student student, double grade) {
		studentList.add(student);
		gradeList.add(grade);
		gradeSum += grade;
		if(gradeList.get(this.lowestGradeIndex) > grade) lowestGradeIndex = gradeList.size() - 1;
		if(gradeList.get(this.highestGradeIndex) < grade) highestGradeIndex = gradeList.size() - 1;
		gradeDistribution[((int)grade)/10]++;
	}
	
	String displayMessage() {
		return "Welcome to the grade book for " + this.course.getDescription() + " " + this.course.getName() + "!";
	}
	
	String determineClassAverage() {
		if(gradeList.size() == 0) return "There're no students in grade book";
		return  "Class average is " + gradeSum / gradeList.size();
	}
	String getLowestGrade() {
		if(gradeList.size() == 0) return "There're no students in grade book";
		return "Lowest grade is " + gradeList.get(this.lowestGradeIndex) + " (" + studentList.get(this.lowestGradeIndex) +  ").";
	}
	String getHighestGrade() {
		if(gradeList.size() == 0) return "There're no students in grade book";
		return "Highest grade is " + gradeList.get(this.highestGradeIndex) + " (" + studentList.get(this.highestGradeIndex) +  ").";
	}
	
	String displayGradeReport() {
		String report = new String();
		report += this.determineClassAverage() + ".\n";
		report += this.getLowestGrade() + '\n';
		report += this.getHighestGrade() + "\n\n";
		report += this.outputBarChart();
		return report;
	}
	
	String outputBarChart() {
		String distribution = "Grades distribution: \n";
		for(int i = 0; i < 11; i++) {
			if(i != 10) distribution += i + "0-" + i + "9: ";
			else distribution += i + "0: ";
			for(int j = 0; j < gradeDistribution[i]; j++) {
				distribution += "*";
			}
			distribution += '\n';
		}
		
		return distribution;
	}
}
	
