package ch08.introduction;

public class TwoDimensionalArrayBasics {

	/*
	 * An element in a two-dimensional array is accessed through a row and column
	 * index
	 */

	public static void main(String[] args) {

		// (1) Declaring variables of two-dimensional arrays and creating
		// two-dimensional arrays

		System.out.println("(1)");
		int[][] matrix = new int[5][5];
		displayMatrix(matrix);
		// int matrix2[][] = new int[5][5]; // allowed but not preferred

		matrix[2][1] = 7;
		displayMatrix(matrix);

		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		displayMatrix(array);

		// (2) Obtaining the Lengths of Two-Dimensional Arrays
		int[][] x = new int[3][4];

		// (3) Ragged Arrays
		System.out.println("(3)");
		int[][] triangleArray = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5 }, { 3, 4, 5 }, { 4, 5 }, { 5 } };
		displayMatrix(triangleArray);
		
		// If you don't know the values in a ragged array in advance, but do know the
		// sizes - say, the same
		// as before - you can create a ragged array using the following syntax:
		
		int[][] triangleArray2 = new int[5][];
		triangleArray2[0] = new int[5];
		triangleArray2[1] = new int[4];
		triangleArray2[2] = new int[3];
		triangleArray2[3] = new int[2];
		triangleArray2[4] = new int[1];
		
		triangleArray2[0][3] = 50;
		triangleArray2[4][0] = 45;
		displayMatrix(triangleArray2);
		
		// (8.1) 
		int[][] matrix3 = new int[4][5];
		
		// (8.2)
		
		// (8.3) error!
		int[][] array3 = new int[5][6];
		int[] x1 = {1, 2};
//		array3[0] = x;

		

	}

	public static void displayMatrix(int[][] matrix) {
		for (int[] array : matrix) {
			for (int value : array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
