package ch08.exercises;

public class CH08_E10_v1 {

	static final int ROW = 4;
	static final int COLUMN = 4;

	public static void main(String[] args) {
		int[][] matrix = new int[ROW][COLUMN];
		initializeMatrix(matrix);
		displayMatrix(matrix);
		System.out.println("The largest row index: " + findLargestRow(matrix));
		System.out.println("The largest column index: " + findLargestColumn(matrix));
	}

	public static void displayMatrix(int[][] matrix) {
		System.out.println("     0 1 2 3");
		System.out.println("     | | | |");
		for (int i = 0; i < matrix.length; ++i) {
			System.out.print(i + " -- ");
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

	}

	public static void initializeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				matrix[i][j] = (int) (Math.random() * 2);
	}

	public static int findLargestRow(int[][] matrix) {
		int[] counts = new int[matrix.length];
		int count = 0;
		for (int row = 0; row < matrix.length; ++row) {
			for (int column = 0; column < matrix[row].length; ++column)
				if (matrix[row][column] == 1)
					++count;
			counts[row] = count;
			count = 0;
		}
		int maxCount = counts[0];
		int maxCountIndex = 0;
		for (int i = 0; i < counts.length; ++i)
			if (maxCount < counts[i]) {
				maxCount = counts[i];
				maxCountIndex = i;
			}
		return maxCountIndex;
	}
	
	public static int findLargestColumn(int[][] matrix) {
		int[] counts = new int[matrix[0].length];
		int count = 0;
		for (int column = 0; column < matrix.length; ++column) {
			for (int row = 0; row < matrix[column].length; ++row)
				if (matrix[row][column] == 1)
					++count;
			counts[column] = count;
			count = 0;
		}
		int maxCount = counts[0];
		int maxCountIndex = 0;
		for (int i = 0; i < counts.length; ++i)
			if (maxCount < counts[i]) {
				maxCount = counts[i];
				maxCountIndex = i;
			}
		return maxCountIndex;
	}
}
