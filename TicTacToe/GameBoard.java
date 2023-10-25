
public class GameBoard {
	//attributes
	private char empty = ' ';
	private char[][] board = new char[3][3];
	
	//constuctor
	public GameBoard () {
	}
	//method
	public void EmptyBoard () {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = this.empty;
			}
		}
	}
	public int addBoard(int a, int b, char e) {
		if (board[a][b] == ' ') {
			board[a][b] = e;
			return 1;
			}
		else {
			return-1;
		}
		
	} 
	public void playedBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	

}
