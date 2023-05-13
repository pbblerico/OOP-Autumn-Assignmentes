package problem3;

public class Position {
	private char col;
	private int row;
	private int x;
	private int y;
	
	public Position() {}
	
	public Position(String pos) {
		this.col = pos.charAt(0);
		this.row = pos.charAt(1) - '1' + 1;
		this.x = row - 1;
		this.y = this.col - 'a';
	}
	
	public Position(char col, int row) {
		this("" + col + row);
	}
	
	public char getCol() {
		return this.col;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	private int rowToX() {
		return this.row - 1;
	}
	
	private int colToY() {
		return this.col - 'a';
	}
	
	public String setPosition(char col, int row) {
		if(!isCorrectPosition(col, row)) return "position in incorrect, try again";
		this.col = col;
		this.row = row;
		this.x = this.rowToX();
		this.y = this.colToY();
		return "position changed";
	}
	
	public String setPosition(Position pos) {
		return this.setPosition(pos.col, pos.row);
	}
	
	public String setPosition(String pos) {
		return this.setPosition(pos.charAt(0), pos.charAt(1) - '1' + 1);
	}
	
	public static boolean isCorrectPosition(char vertical, int horizontal) {
		boolean correctVertical = 1 <= horizontal && horizontal <= 8;
		boolean correctHorizontal = 'a' <= vertical && vertical <= 'h';
		return correctVertical && correctHorizontal;
	}
	
	public static boolean isCorrectPosition(Position pos) {
		return Position.isCorrectPosition(pos.getCol(), pos.getRow());
	}
	
	public static boolean isCorrectPosition(String pos) {
		return Position.isCorrectPosition(pos.charAt(0), pos.charAt(1) - '1' + 1);
	}
	
	public boolean sameCol(Position pos) {
		return this.col == pos.getCol();
	}
	
	public boolean sameRow(Position pos) {
		return this.row == pos.getRow();
	}
	
	public double getRowDistance(Position pos) {
		return Math.abs((double) (row - pos.row));
	}
	
	public double getColDistance(Position pos) {
		return Math.abs((double) (col - pos.col));
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Position pos = (Position) o;
		return this.sameCol(pos) && this.sameRow(pos);
	}
	
	public String toString() {
		return "" + this.col + this.row + " " + this.y + " " + this.x;
	}
}
