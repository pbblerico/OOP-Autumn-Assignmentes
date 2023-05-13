package problem3;

import java.util.Scanner;

public class TestChess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chess chess = new Chess();
		
		System.out.println(chess.rules() + '\n' + chess.startGame() + '\n');
		
		String pos1, pos2;
		
		
		while(true) {
			chess.showBoard();
			pos1 = sc.next();
			if(pos1.equals("-")) break;

			pos2 = sc.next();
			chess.game(pos1, pos2);
		}
		sc.close();
	}
}
