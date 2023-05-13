package problem3;

public class Test {
	public static void main(String[] args) {
		MyVector numbers = new MyVector();
		MyHashSet nums = new MyHashSet();
		
		System.out.println(nums.add(1));
		System.out.println(nums.add(1));
		System.out.println(nums.add(2));
		System.out.println(nums.add(3));
		
		System.out.println(nums.toString());
		
		System.out.println(nums.isEmpty() + " " + nums.getSize());
		System.out.println(nums.find(1));
		System.out.println(nums.delete(3));
		
		System.out.println(nums.toString());
		
		nums.clear();
		System.out.println(nums.isEmpty());
		
		
		numbers.add(100);
		numbers.add(565);
		numbers.add(345);
		numbers.add(23);
		

		System.out.println(numbers.toString());
		
		System.out.println(numbers.isEmpty() + " " + numbers.getSize());
		System.out.println(numbers.find(100));
		System.out.println(numbers.delete(345));
		
		System.out.println(numbers.toString());
		
		numbers.clear();
		System.out.println(numbers.isEmpty());
	}
}
