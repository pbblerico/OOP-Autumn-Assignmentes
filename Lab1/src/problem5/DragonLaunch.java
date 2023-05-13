package problem5;
import java.util.Vector;

public class DragonLaunch {
	static Vector <Person> kidnapped;
	
	static {
		kidnapped = new Vector<Person>();
	}
	
	public static void main(String[] args) {
//		kidnap(new Person(Gender.GIRL));
		kidnap(new Person(Gender.BOY));
		kidnap(new Person(Gender.BOY));
		kidnap(new Person(Gender.GIRL));
		kidnap(new Person(Gender.GIRL));
		kidnap(new Person(Gender.BOY));
		System.out.println((willDragonEatOrNot()) ? "Happy Dragon" : "Sad dragon");
	}
	
	static void kidnap(Person student) {
		kidnapped.add(student);
	}
	
	static boolean willDragonEatOrNot() {
		if(kidnapped.get(0).getGender() == Gender.GIRL) return true;
		int cnt = 0;
		for(Person food: kidnapped) {
			if(food.getGender() == Gender.BOY) cnt++;
			else cnt--;
		}
		return cnt != 0;
	}
}

