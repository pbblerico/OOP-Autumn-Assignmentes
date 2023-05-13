package problem1;

import java.util.Scanner;	

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cube c = new Cube("glass", "red", true, 10);
		System.out.println(c instanceof Shapes3D);
//		
//		Shapes3D cShape = c;
//		System.out.println(cShape.getColor());
//		
//		Cylinder cyl = new Cylinder("iron", "black", false, 10, 23);
//		System.out.println(cyl.returnFormated(3, cyl.baseArea()) + " " + cyl.returnFormated(cyl.baseArea()));
//		Shapes3D cylShape = cyl;
//		System.out.println(cylShape.volume());
//		
////		boolean check = cyl instanceof Cube;
//		System.out.println(cyl instanceof Cylinder);
//		sc.close();
//		
		
	}
}
