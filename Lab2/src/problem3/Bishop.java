package problem3;

public class Bishop extends Piece{
	public Bishop() {}
	
	public Bishop(Position pos){
		super(pos);
	}
	public Bishop(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}

	public boolean isLegalMove(Position p2) {
		return this.getPosition().getRowDistance(p2) == this.getPosition().getColDistance(p2);
	}
}
