package problem1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Data set = new Data();
		
		while(sc.hasNextDouble()) {
			set.addValue(sc.nextDouble());
		}
		sc.close();
		System.out.println("Average: " + set.getAverage() + "\nMaximum: " + set.getLargest());
	}
}

