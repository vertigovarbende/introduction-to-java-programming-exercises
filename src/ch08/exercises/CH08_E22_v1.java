package ch08.exercises;

public class CH08_E22_v1 {

	static final int SIZE = 6;

	public static void main(String[] args) {
		int[][] matrix = new int[SIZE][SIZE];
		initializeMatrix(matrix);
		displayMatrix(matrix);
		if (evenNumberOfOnes(matrix))
			System.out.println("Every row and every column have an even number of 1s");
		else
			System.out.println("Every row and every column don't have an even number of 1s");

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

	public static boolean evenNumberOfOnes(int[][] matrix) {
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
