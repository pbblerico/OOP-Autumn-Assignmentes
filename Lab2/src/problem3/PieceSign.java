package problem3;

public enum PieceSign {
	WK('K'), WQ('Q'), WR('R'), WB('B'), WN('N'), WP('P'), BK('k'), BQ('q'), BR('r'), BB('b'), BN('n'), BP('p');
//	WK('♔'), WQ('♕'), WR('♖'), WB('♗'), WN('♘'), WP('♙'), BK('♚'), BQ('♛'), BR('♜'), BB('♝'), BN('♞'), BP('♟');
	private final char piece;
	
	private PieceSign(char piece) {
		this.piece = piece;
	}
	
	public String toString() {
		return "" + piece;
	}
}
