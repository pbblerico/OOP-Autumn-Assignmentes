package problem3;

public class Chess {
	static Board b;
	Player player1;
	Player player2;
	static boolean whiteMove, check;
	Position whiteKingPos;
	Position blackKingPos;
	
	static {
		b = new Board();
		whiteMove = true;
		check = false;
	}
	
	{
		player1 = new Player("White");
		player2 = new Player("Black");
		whiteKingPos = new Position("e1");
		blackKingPos = new Position("e8");
	}
	
	public Chess() {
		b.setNewBoard();
	}
	
	String rules() {
		return "input for initial then final position, if you made mistake try again.\n"
				+ "if you want to:\n\tstop before your turn print -\n";
	}
	
	String startGame() {
		return "Game started, white side turn!";
	}
	
	String announcePlayer(boolean whiteMove) {
		return (whiteMove) ? "player1 turn" : "player2 turn";
	}
	
	void showBoard() {
		System.out.println(b.draw());
	}
	
	boolean isCheck(Position pos) {
		Piece p = Piece.checkPiece(pos);
		if(whiteMove && p.isLegalMove(blackKingPos)) return true;
		if(!whiteMove && p.isLegalMove(whiteKingPos)) return true;
		return false;
	}
	
	public void game(String pos1, String pos2) {
		
		Player curPlayer = (whiteMove) ? player1 : player2;
		
		if(curPlayer.move(new Position(pos1), new Position(pos2), whiteMove)) {
			if(whiteMove && new Position(pos1).equals(whiteKingPos)) whiteKingPos = new Position(pos1);
			if(!whiteMove && new Position(pos1).equals(blackKingPos)) blackKingPos = new Position(pos1);
			if(isCheck(new Position(pos2))) {
				check = true;
				System.out.println("Check");
			}
			whiteMove = !whiteMove;
		}
		
	}
}
