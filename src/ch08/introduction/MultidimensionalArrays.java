package ch08.introduction;

public class MultidimensionalArrays {

	/*
	 * A two-dimensional array consists of an array of one-dimensional arrays and
	 * three-dimensional array consists of an array of two-dimensional arrays
	 */

	public static void main(String[] args) {

		/*
		 * The way to declare two-dimensional array variables and create two-dimensional
		 * arrays can be generalized to declare n-dimensional array variables and create
		 * n-dimensional arrays for n 7= 3. For example, you may use a three-dimensional
		 * array to store exam scores for a class of six students with five exams, and
		 * each exam has two parts (multiple-choice and essay). The following syntax
		 * declares a three-dimensional array variable scores, creates an array, and
		 * assigns its reference to scores.
		 */

		double[][][] scores = { { { 7.5, 20.5 }, { 9.0, 22.5 }, { 15, 33.5 }, { 13, 21.5 }, { 15, 2.5 } },
				{ { 4.5, 21.5 }, { 9.0, 22.5 }, { 15, 34.5 }, { 12, 20.5 }, { 14, 9.5 } },
				{ { 6.5, 30.5 }, { 9.4, 10.5 }, { 11, 33.5 }, { 11, 23.5 }, { 10, 2.5 } },
				{ { 6.5, 23.5 }, { 9.4, 32.5 }, { 13, 34.5 }, { 11, 20.5 }, { 16, 7.5 } },
				{ { 8.5, 26.5 }, { 9.4, 52.5 }, { 13, 36.5 }, { 13, 24.5 }, { 16, 2.5 } },
				{ { 9.5, 20.5 }, { 9.4, 42.5 }, { 13, 31.5 }, { 12, 20.5 }, { 16, 6.5 } } };

		// scores[i] --> which student
		// scores[i][j] --> which exam
		// scores[i][j][k] --> multiple-choice or essay

	}
}