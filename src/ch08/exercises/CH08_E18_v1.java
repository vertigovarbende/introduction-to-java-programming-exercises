package ch08.exercises;

public class CH08_E18_v1 {

	public static void main(String[] args) {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		System.out.println("before shuffling");
		displayMatrix(m);
		System.out.println("after shuffling");
		shuffle(m);
		displayMatrix(m);
	}

	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; ++i) {
			int k = (int) (Math.random() * m.length);

			int[] temp = m[i];
			m[i] = m[k];
			m[k] = temp;
		}
	}

	public static void displayMatrix(int[][] matrix) {
		System.out.print("{");
		for (int i = 0; i < matrix.length; ++i) {
			System.out.print("{");
			for (int j = 0; j < matrix[i].length; ++j) {
				if (j == 0)
					System.out.print(matrix[i][j] + ", ");
				else
					System.out.print(matrix[i][j]);
			}
			System.out.print("}");
		}
		System.out.println("}");
	}
}