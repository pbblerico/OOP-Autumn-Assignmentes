package problem3;

import java.util.Vector;

public class MyVector implements MyCollection {
	private Vector <Object> vec;
	
	{
		vec = new Vector <Object>();
	}
	
	public MyVector() {}
	
	public boolean add(Object o) {
		vec.add(o);
		return true;
	}

	public boolean delete(Object o) {
		if(isEmpty()) return false;
		if(find(o)) {
			vec.remove(o);
			return true;
		}
		return false;
	}

	public int getSize() {
		return vec.size();
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean find(Object o) {
		for(Object ob: vec) {
			if(ob.equals(o)) return true;
		}
		return false;
	}

	public void clear() {
		vec.clear();
	}
	
	public String toString() {
		String ans = new String();
		for(Object o: vec) {
			ans += o + "\n";
		}
		return ans;
	}
}
