package problem3;

public class Pawn extends Piece{
	private boolean firstTurn;
	
	{
		firstTurn = true;
	}
	public Pawn() {}
	
	public Pawn(Position pos) {
		super(pos);
	}
	
	public Pawn(PieceSign sign, Position pos, Color color) {
		super(sign, pos, color);
	}
	
	public Pawn(PieceSign sign, Position pos, Color color, boolean firstTurn) {
		super(sign, pos, color);
		this.firstTurn = firstTurn;
	}
	
	public boolean isFirstTurn() {
		return this.firstTurn;
	}

	public boolean isLegalMove(Position p2) {
		boolean ans;
		double x1 = (double) this.getPosition().getRow() ;
		double x2 = (double) p2.getRow();
		double diffX = this.getPosition().getRowDistance(p2);
		double diffY = this.getPosition().getColDistance(p2);

		if(!this.getPosition().sameCol(p2)) {
			ans = diffY == 1 && diffX == 1 && Piece.checkPiece(p2) != null;
		}
		else {
			if(Piece.checkPiece(p2) != null) return false;
			else if(firstTurn) ans = diffX <= 2;
			else ans = diffX == 1;
		}
		
		if(this.getColor() == Color.BLACK) ans = ans && x1 > x2;
		else ans = ans && x1 < x2;
		
		if(ans) firstTurn = false;
		return ans;
	}
	
	public String toString() {
		return super.toString() + " " + firstTurn;
	}
}
