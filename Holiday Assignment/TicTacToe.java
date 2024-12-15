import java.util.Scanner;

public class TicTacToe {
	private char[][] board = new char[3][3];

	public void initializeBoard() {
		for(int number = 0; number < 3; number++) {
			for(int digit = 0; digit < 3; digit++) {
				board[number][digit] = ' ';
			}
		}
	}

	
	public void printBoard() {
		for(int number = 0; number < 3; number++) {
			for(int digit = 0; digit < 3; digit++) {
				System.out.print(board[number][digit]);
				if(digit < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (number < 2) System.out.println("----------");
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
		for(int number = 0; number < 3; number++) {
			if(board[number][0] == piece && board[number][1] == piece && board[number][2] == piece) {
				return true;
			}
		}

		for(int number = 0; number < 3; number++) {
			if(board[0][number] == piece && board[1][number] == piece && board[2][number] == piece) {
				return true;
			}
		}

		if ((board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) || (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece)) {
			return true;
		}

		return false;
	}
	
	public boolean checkForDraw() {
		for(int number = 0; number < 3; number++) {
			for(int digit = 0; digit < 3; digit++) {
				if(board[number][digit] == ' ') {
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