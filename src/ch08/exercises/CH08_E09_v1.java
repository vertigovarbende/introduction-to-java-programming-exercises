package ch08.exercises;

import java.util.Scanner;

public class CH08_E09_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		// problem - 2 --> draw problem!
		// problem - 4 --> change table!
		// problem - 5 --> draw problem 2!
		// problem - 6 --> change while loop!
		startGame();
	}

	public static void startGame() {
		// burada table gösterilecek
		String[][] table = { { "*", "*", "*" }, { "*", "*", "*" }, { "*", "*", "*" } };
		String playAgain = "";
		int countPut = 0;
		int status = 0;

		displayTable(table);
		while (true) {
			initializeTable("X", table);
			++countPut;
			displayTable(table);
			if (checkWin(table)) {
				System.out.print("Do you want to play again (Y/N): ");
				playAgain = INPUT.next();
				if (playAgain.equalsIgnoreCase("y"))
					startGame();
				else if (playAgain.equalsIgnoreCase("n"))
					break;
			}
			initializeTable("O", table);
			++countPut;
			displayTable(table);
			if (checkWin(table)) {
				System.out.print("Do you want to play again (Y/N): ");
				playAgain = INPUT.next();
				if (playAgain.equalsIgnoreCase("y"))
					startGame();
				else if (playAgain.equalsIgnoreCase("n"))
					break;
			}

			if (countPut == 8 && (checkWin(table) == false)) {
				System.out.println("Draw");
				status = 1;
			}

		}

	}

	public static boolean checkWin(String[][] table) {
		boolean xWon = false;
		boolean oWon = false;
		// horizontal
		if (checkXHorizontal(table))
			xWon = true;
		else if (checkOHorizontal(table))
			oWon = true;

		// vertical
		if (checkXVertical(table))
			xWon = true;
		else if (checkOVertical(table))
			oWon = true;

		// diagonal
		if (checkXDiagonal(table))
			xWon = true;
		else if (checkODiagonal(table))
			oWon = true;

		if (xWon) {
			System.out.println("X player won");
			return xWon;
		} else if (oWon) {
			System.out.println("O player won");
			return oWon;
		}
		return false;
	}

	public static void displayTable(String[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static void initializeTable(String player, String[][] matrix) {
		int iIndex = 0, jIndex = 0;
		while (true) {
			System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
			iIndex = INPUT.nextInt();
			if (iIndex < 0 || iIndex > 2) {
				System.out.println("Please enter between 0 and 2");
				continue;
			} else
				break;
		}

		while (true) {
			System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
			jIndex = INPUT.nextInt();
			if (jIndex < 0 || jIndex > 2)
				continue;
			else
				break;
		}

		if (!matrix[iIndex][jIndex].equals("*")) {
			System.out.println("It isn't empty. Please enter a new row and column.");
			initializeTable(player, matrix);
		} else {
			if (player.equals("X"))
				matrix[iIndex][jIndex] = "X";
			else
				matrix[iIndex][jIndex] = "O";
		}
	}

	public static boolean checkXHorizontal(String[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == "X")
					++count;
			}
			if (count == 3) {
				return true;
			}
			count = 0;
		}
		return false;
	}

	public static boolean checkXVertical(String[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[j][i] == "X")
					++count;
			}
			if (count == 3)
				return true;
			count = 0;
		}
		return false;
	}

	public static boolean checkXDiagonal(String[][] matrix) {
		int a = matrix.length - 1;
		int countFirst = 0;
		int countSecond = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (i == j) {
					if (matrix[i][j] == "X")
						++countFirst;
				}
			}
			if (countFirst == 3)
				return true;
		}

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (j - i == a) {
					a -= 2;
					if (matrix[i][j] == "X") {
						++countSecond;
					}
				}
			}
			if (countSecond == 3)
				return true;
		}
		return false;
	}

	public static boolean checkOHorizontal(String[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == "X")
					++count;
			}
			if (count == 3) {
				return true;
			}
			count = 0;
		}
		return false;
	}

	public static boolean checkOVertical(String[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[j][i] == "X")
					++count;
			}
			if (count == 3)
				return true;
			count = 0;
		}
		return false;
	}

	public static boolean checkODiagonal(String[][] matrix) {
		int a = matrix.length - 1;
		int countFirst = 0;
		int countSecond = 0;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (i == j) {
					if (matrix[i][j] == "O")
						++countFirst;
				}
			}
			if (countFirst == 3)
				return true;
		}

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (j - i == a) {
					a -= 2;
					if (matrix[i][j] == "O") {
						++countSecond;
					}
				}
			}
			if (countSecond == 3)
				return true;
		}
		return false;
	}

}