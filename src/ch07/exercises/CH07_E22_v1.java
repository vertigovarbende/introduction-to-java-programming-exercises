package ch07.exercises;

import java.util.Random;

public class CH07_E22_v1 {
	// you didn't solve this! look at again!

	static final Random RAND = new Random();
	static final int SIZE = 8;

	public static void main(String[] args) {

		String[][] chessBoard = new String[SIZE][SIZE];
		start(chessBoard);
		displayChessBoard(chessBoard);
	}

	public static void start(String[][] chessBoard) {
		int randomColumn = 0, randomRow = 0;
		int[] randomIndexes = new int[SIZE];

	}

	public static void createRandomIndexes(int[][] randomIndexes) {
		randomIndexes[0][0] = RAND.nextInt(randomIndexes.length);
		randomIndexes[0][1] = RAND.nextInt(randomIndexes.length);
		for (int i = 1; i < randomIndexes.length; ++i) {
			for (int j = 0; j < randomIndexes[0].length; ++j) {

			}
		}
	}

	public static void displayChessBoard(String[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; ++i) {
			for (int j = 0; j < chessBoard.length; ++j) {
				if (j == chessBoard.length)
					System.out.print("|" + chessBoard[i][j] + "|");
				else
					System.out.print("|" + chessBoard[i][j]);
			}
			System.out.println();
		}
	}
}
