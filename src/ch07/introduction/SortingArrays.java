package ch07.introduction;

public class SortingArrays {

	/*
	 * Sorting, like searching, is a common task in computer programming. Many
	 * different algorithms have been developed for sorting. This section introduces
	 * an intuitive sorting algorithm: selection sort.
	 */
	public static void main(String[] args) {

		// (1) Selection Sort
		/*
		 * Suppose that you want to sort a list in ascending order. Selection sort finds
		 * the smallest number in the list and swaps it with the first element. It then
		 * finds the smallest number remaining and swaps it with the second element, and
		 * so on, until only a single number remains. Figure 7.11 shows how to sort the
		 * list {2, 9, 5, 4, 8, 1, 6} using selection sort.
		 */

		int[] array = { 2, 9, 5, 4, 8, 1, 6 };
//		myFindingSort(array);
//		displayArray(array);

		selectionSort(array);
		displayArray(array);

		// (7.24)
		double[] array2 = { 3.4, 5, 3, 3.5, 2.2, 1.9, 2 };
		selectionSort(array2);
		displayArray(array2);

		// (7.25)
		double[] array3 = { 2, 9, 5, 4, 8, 1, 6 };
		selectionSortDecreasing(array3);
		displayArray(array3);

		array3 = new double[] { 2, 9, 5, 4, 8, 1, 6 };
		myFindingSortDecreasing(array3);
		displayArray(array3);

	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// (7.25)
	public static void selectionSortDecreasing(double[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			double currentMax = array[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < array.length; ++j) {
				if (currentMax < array[j]) {
					currentMax = array[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				array[currentMaxIndex] = array[i];
				array[i] = currentMax;
			}
		}
	}

	// (7.24)
	public static void selectionSort(double[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			double currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; ++j) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; ++j) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

	public static void myFindingSort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = i + 1; j < array.length; ++j) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	public static void myFindingSortDecreasing(double[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = i + 1; j < array.length; ++j) {
				if (array[i] < array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}