import java.util.Scanner;

public class TicTacToe {
	private char[][] board = new char[3][3];

	public void initializeBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	
	public void printBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if(j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) System.out.println("----------");
		}
	}

	public void placePiece(int row, int col, char piece) {
		if(board[row][col] == ' ') {
			board[row][col] = piece;
		} else {
			System.out.println("The spot is already taken! Choose another place.");
		}
	}

	public boolean checkForWin(char piece) {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == piece && board[i][1] == piece && board[i][2] == piece) {
				return true;
			}
		}

		for(int i = 0; i < 3; i++) {
			if(board[0][i] == piece && board[1][i] == piece && board[2][i] == piece) {
				return true;
			}
		}

		if ((board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) || (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece)) {
			return true;
		}

		return false;
	}
	
	public boolean checkForDraw() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == ' ') {
					return false;
			}
		}
	}
	
	return true;
}

	public static void main(String... args) {
		TicTacToe game = new TicTacToe();
		Scanner scanner = new Scanner(System.in);
		game.initializeBoard();

		char currentPlayer = 'X';
		boolean gameEnded = false;

		System.out.println("Welcome to Tic Tac Toe game!");
		game.printBoard();

		while(!gameEnded) {
			System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0, 1, or 2): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();

			if(row < 0 || row > 2 || col < 0 || col > 2 || game.board[row][col] != ' ') {
				System.out.println("Invalid move, Try again...");
				continue;
			}

			game.placePiece(row, col, currentPlayer);
			game.printBoard();

			if(game.checkForWin(currentPlayer)) {
				System.out.println("Player " + currentPlayer + " Wins!");
			gameEnded = true;
			} else if(game.checkForDraw()) {
				System.out.println("It's a draw!");
				gameEnded = true;
			} else {
				currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			}
		}
	}
}