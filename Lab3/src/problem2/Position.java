package problem2;

public class Position {
	int x;
	int y;
	
	{
		x = 0;
		y = 0;
	}
	
	public Position() {}
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y; 
	}
}
