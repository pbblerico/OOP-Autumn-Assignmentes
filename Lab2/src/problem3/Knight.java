package problem3;

public class Knight extends Piece{
	public Knight() {}
	
	public Knight(Position pos) {
		super(pos);
	}

	public Knight(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}
	public boolean isLegalMove(Position p2) {
		return this.getPosition().getRowDistance(p2) + this.getPosition().getColDistance(p2) + 2 == 5.0;
	}
	
}
