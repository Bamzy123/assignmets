public class TicTacToe {

	private char [][] board = new char [3][3];

	public void initialBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board [i][j] = ' ';
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board [i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public void placePiece (int row, int col, char piece) {
		board [row][col] = piece;
	}

	public static void main (String... args) {
		TicTacToe game = new TicTacToe();

		game.initialBoard();

		game.printBoard();
	}
}