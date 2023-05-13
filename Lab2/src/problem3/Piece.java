package problem3;

public abstract class Piece {
	private Position position;
	private Color color;
	private PieceSign sign;
	
	public Piece() {}
	public Piece(Position p) {
		this.position = p;
	}
	
	public Piece(PieceSign sign, Position pos, Color color) {
		this.sign = sign;
		this.position = pos;
		this.color = color;
	}
	
	public PieceSign getSign() {
		return this.sign;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public String move(Position p2) {
		if(!this.moveCheck(p2)) return "you can't move";

		this.getPosition().setPosition(p2);
		return "ok";
	}
	
	public boolean moveCheck(Position p2) {
		if(!Position.isCorrectPosition(p2)) return false;
		if(this.getPosition().equals(p2)) return false;
		if(!this.isLegalMove(p2)) return false;
		
		System.out.println("fdfd");
		if(this instanceof Queen || this instanceof Bishop || this instanceof Rook) {
			if(!this.checkDiff(p2)) return false;
		}
		return true;
	}
	
	public static Piece checkPiece(Position pos) {
		if(!Position.isCorrectPosition(pos)) {
			System.out.println("position is incorrect, try again");
			return null;
		}
		return Board.board[pos.getX()][pos.getY()];
	}
	
	public boolean cannotEat(Piece p2){
		if(p2 == null) return false;
		if(this.getColor() == p2.getColor()) return true;
		return false;
	}
	
	public boolean checkDiff(Position pos2) {
		int diffH = pos2.getRow() - this.getPosition().getRow();
		int diffV = (int) (pos2.getCol() - this.getPosition().getCol());
		
		diffH = (diffH > 0) ? 1 : (diffH < 0) ? -1 : 0;
		diffV = (diffV > 0) ? 1 : (diffV < 0) ? -1 : 0;
		
		Position tempPos = new Position(this.position.getCol(), this.position.getRow());
		return checkObstacles(tempPos, pos2, diffH, diffV);
	}
	
	public boolean checkObstacles(Position pos1, Position pos2, int diffH, int diffV) {
		if(pos1.equals(pos2)) return true;
		pos1.setPosition((char) (pos1.getCol() + diffV), pos1.getRow() + diffH);
		System.out.println(pos1);
		if(!pos1.equals(pos2) && Piece.checkPiece(pos1) != null) {
			return false;
		}
		return checkObstacles(pos1, pos2, diffH, diffV);
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Piece p = (Piece) o;
		return this.position.equals(p.getPosition()) && this.color == p.getColor() && this.sign == p.getSign();
	}
		
	public abstract boolean isLegalMove(Position p2);
	
	public String toString() {
		return this.sign + " " + this.color + " " + this.position;
	}
}
