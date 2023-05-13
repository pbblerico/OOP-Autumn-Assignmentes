package problem3;

public class King extends Piece{
	public King() {}
	
	public King(Position pos) {
		super(pos);
	}
	
	public King(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}

	public boolean isLegalMove(Position p2) {
		return this.getPosition().getColDistance(p2) <= 1 && this.getPosition().getRowDistance(p2) <= 1;
	}
}
