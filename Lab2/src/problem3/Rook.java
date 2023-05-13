package problem3;

public class Rook extends Piece{
	public Rook() {}
	
	public Rook(Position pos) {
		super(pos);
	}
	
	public Rook(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}
	
	public boolean isLegalMove(Position p2) {
		boolean vertical = this.getPosition().sameRow(p2) && !this.getPosition().sameCol(p2);
		boolean horizontal = !this.getPosition().sameRow(p2) && this.getPosition().sameCol(p2);
		return vertical || horizontal;
	}
	
}
