package ch08.exercises;

public class CH08_E22_v2 {		// check every row and column whether have 1s or not

	static final int SIZE = 6;

	public static void main(String[] args) {
		int[][] matrix = new int[SIZE][SIZE];
		initializeMatrix(matrix);
		displayMatrix(matrix);
		if (numberOfOnes(matrix))
			System.out.println("Every row and every column have 1");
		else
			System.out.println("Every row and every column don't have 1");

//		int[][] matrix7 = { 
//				{ 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0 }, 
//				};
//		System.out.println(evenNumberOfOnes(matrix7)); // false
//		
//		int[][] matrix3 = {
//				{0, 0, 0, 1},
//				{0, 0, 1, 0},
//				{0, 1, 0, 0},
//				{1, 0, 0, 0}
//				};
//		System.out.println(evenNumberOfOnes(matrix3)); // true

	}

	public static boolean numberOfOnes(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; ++i) {
			count = 0;
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == 1)
					count = 1;
			}
			if (count == 0)
				return false;
		}

		for (int i = 0; i < matrix.length; ++i) {
			count = 0;
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[j][i] == 1)
					count = 1;
			}
			if (count == 0)
				return false;
		}
		return true;
	}

	public static void initializeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				matrix[i][j] = (int) (Math.random() * 2);
	}

	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}