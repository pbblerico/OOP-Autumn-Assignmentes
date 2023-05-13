package problem3;

import java.util.HashSet;

public class MyHashSet implements MyCollection {
	private HashSet <Object> hs;
	
	{
		hs = new HashSet <Object>();
	}
	
	public MyHashSet() {}

	public boolean add(Object o) {
		if(find(o)) return false;
		hs.add(o);
		return true;
	}

	public boolean delete(Object o) {
		if(find(o)) {
			hs.remove(o);
			return true;
		}
		return false;
	}

	public int getSize() {
		return hs.size();
	}

	public boolean isEmpty() {
		return hs.isEmpty();
	}

	public boolean find(Object o) {
		return hs.contains(o);
	}

	public void clear() {
		hs.clear();
	}
	
	public String toString() {
		String ans = new String();
		for(Object o: hs) {
			ans += o + "\n";
		}
		return ans;
	}
}
