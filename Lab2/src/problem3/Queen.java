package problem3;

public class Queen extends Piece{
	public Queen() {}
	
	public Queen(Position pos) {
		super(pos);
	}

	public Queen(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}
	public boolean isLegalMove(Position p2) {
		return (new Bishop(this.getPosition())).isLegalMove(p2) || (new Rook(this.getPosition())).isLegalMove(p2);
	}
}
