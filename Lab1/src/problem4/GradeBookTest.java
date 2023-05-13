package problem4;
import java.util.Scanner;

import practice2.Student;

public class GradeBookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Course pp2 = new Course("Perogramming principicles 2", "CSCI 1203", 5);
		Course oop = new Course("Object-Oriented Programming and design", "CSCI 2106", 5, pp2);
		GradeBook book = new GradeBook(oop);
		
		System.out.println(book.displayMessage());
		System.out.println("\nPlease, input grades for students or \"stop\" if you want to leave.");
		
		String name = sc.next();
		
		while(!name.equals("stop")) {
			double grade = sc.nextDouble();
			book.addStudent(new Student(name), grade);
			name = sc.next();
		}
		sc.close();
		
		System.out.println(book.displayGradeReport());
	}
}

