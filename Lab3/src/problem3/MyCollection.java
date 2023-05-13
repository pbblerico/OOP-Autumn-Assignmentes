package problem3;

public interface MyCollection {
	boolean add(Object o);
	
	boolean delete(Object o);
	
	int getSize();
	
	boolean isEmpty();
	
	boolean find(Object o);
	
	void clear();
	
	public String toString();
}
