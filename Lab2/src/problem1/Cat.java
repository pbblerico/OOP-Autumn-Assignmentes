package problem1;

public class Cat {
    String name;
 
    private static Cat renameCat(Cat cat) {
        System.out.print(cat.name);
        cat = new Cat();
        cat.name = "Mia";
        return cat;
    }
 
    public static void main(String[] args) {
    	if (one() & two() | one()) {
    	System.out.print("three");
    	}
    	}
    	private static boolean two() {
    	System.out.print("two");
    	return false;
    	}
    	private static boolean one() {
    	System.out.print("one");
    	return true;
    	}
}