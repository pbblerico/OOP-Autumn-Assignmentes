package problem3;

public class Board {
	static Piece[][] board;

	static {
		board = new Piece[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		}
	}
	
	public Board() {}
	
	public void setNewBoard() {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 8; j++) {
				if(i == 0) {
					board[i][j] = PieceSets.white.get(j);
					board[7 - i][j] = PieceSets.black.get(j);
				}
				else {
					board[i][j] = PieceSets.white.get(j + 8);
					board[7 - i][j] = PieceSets.black.get(j + 8);
				}
			}
		}
	}

	public String draw() {
		String desk = "";
		for(int i = 0; i < 8; i++) {
			desk += (i + 1) + "|";
			for(int j = 0; j < 8; j++) {
				Piece field = Board.board[i][j];
				desk += ((field != null) ? field.getSign() : "*") + "|";
			}
			desk += '\n';
		}
		desk += "  a b c d e f g h\n";
		return desk;
	}
}
