package problem3;

import java.util.Vector;

public class Player {
	Color pieceColor;
	Vector <Piece> pieces;
	boolean check;
	boolean mate;
	
	{
		pieces = new Vector <Piece>();
	}
	
	public Player() {}
	
	public Player(String color) {
		if(color.equals("White")) pieces = PieceSets.white;
		else pieces = PieceSets.black;
	}
	
	
	public Piece playerPicksPiece(Position pos, boolean white) {
		Piece p = Piece.checkPiece(pos);
		
		if(p != null) {
			if(p.getColor() != Color.WHITE && white || p.getColor() == Color.WHITE && !white) {
				System.out.println("Don't use your partner pieces!");
				return null;
			}
		}
		return p;
	}
	
	public boolean move(Position pos1, Position pos2, boolean white) {
		Piece p = this.playerPicksPiece(pos1, white);
		
		if(p == null) return false;
		
		Piece p2 = Piece.checkPiece(pos2);
		
		if(p2 != null && p.cannotEat(p2)) return false;
		
		if(p.move(pos2) != "ok") return false;
		
		Board.board[pos1.getX()][pos1.getY()] = null;
		Board.board[pos2.getX()][pos2.getY()] = p;
		
		return true;
	}
	
}
