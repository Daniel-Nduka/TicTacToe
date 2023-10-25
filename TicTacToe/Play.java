import java.util.Scanner;
public class Play {
	public static void main(String[] agrs) {
		GameBoard Board = new GameBoard ();
		
		//print empty board
		Board.EmptyBoard();
		char[] players = {'X', 'O'};
		
		int playerCount = 0;
		
		//Get input from user
		Scanner s = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("Player: enter an index number ");
			int a = s.nextInt();
			int b = s.nextInt();
			
			//ensuring the correct index is entered for both player one and 2
			while (true) {
				if (a < 0 || a > 2 || b < 0 || b > 2) {
					System.out.println("not a valid index. Enter a correct one");
					a = s.nextInt();
					b = s.nextInt();
				}
				else {
						break;
					}
			}
		
			int okayMove1 = Board.addBoard(a, b, players[playerCount]);
			int okayMove2 = Board.addBoard(a, b, players[playerCount]);
			
			playerCount = 1 - playerCount;
			Board.playedBoard();
		}
		
	}
}
