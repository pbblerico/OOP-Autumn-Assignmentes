package problem3;

import java.util.Vector;

public class PieceSets {
	static Vector <Piece> white;
	static Vector <Piece> black;
	
	static {
		white = new Vector <Piece>();
		black = new Vector <Piece>();
		white.add(new Rook(PieceSign.WR, new Position("a1"), Color.WHITE));
		white.add(new Knight(PieceSign.WN, new Position("b1"), Color.WHITE));
		white.add(new Bishop(PieceSign.WB, new Position("c1"), Color.WHITE));
		white.add(new Queen(PieceSign.WQ, new Position("d1"), Color.WHITE));
		white.add(new King(PieceSign.WK, new Position("e1"), Color.WHITE));
		white.add(new Bishop(PieceSign.WB, new Position("f1"), Color.WHITE));
		white.add(new Knight(PieceSign.WN, new Position("g1"), Color.WHITE));
		white.add(new Rook(PieceSign.WR, new Position("h1"), Color.WHITE));
		for(int i = 0; i < 8; i++) {
			char c = (char) ('a' + i);
			white.add(new Pawn(PieceSign.WP, new Position(("" + c + 2)), Color.WHITE));
		}
		
		black.add(new Rook(PieceSign.BR, new Position("a8"), Color.BLACK));
		black.add(new Knight(PieceSign.BN, new Position("b8"), Color.BLACK));
		black.add(new Bishop(PieceSign.BB, new Position("c8"), Color.BLACK));
		black.add(new King(PieceSign.BK, new Position("d8"), Color.BLACK));
		black.add(new Queen(PieceSign.BQ, new Position("e8"), Color.BLACK));
		black.add(new Bishop(PieceSign.BB, new Position("f8"), Color.BLACK));
		black.add(new Knight(PieceSign.BN, new Position("g8"), Color.BLACK));
		black.add(new Rook(PieceSign.BR, new Position("h8"), Color.BLACK));
		for(int i = 0; i < 8; i++) {
			char c = (char) ('a' + i);
			black.add(new Pawn(PieceSign.BP, new Position("" + c + 7), Color.BLACK));
		}
	}
}
