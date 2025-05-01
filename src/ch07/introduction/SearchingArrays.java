package ch07.introduction;

public class SearchingArrays {

	// "if an array is sorted, binary search is more efficient than linear search
	// for finding an element in the array."

	// This section discusses two commonly used approaches, 'linear search' and
	// 'binary search'
	public static void main(String[] args) {

		// (1) Linear Search
		/*
		 * The linear search approach compares the key element key sequentially with
		 * each element in the array. It continues to do so until the key matches an
		 * element in the array or the array is exhausted without a match being found.
		 * If a match is made, the linear search returns the index of the element in the
		 * array that matches the key. If no match is found, the search returns -1.
		 */

		// Listing 7.6 - LinearSeach.java
//		int[] list = { 1, 4, 4, 2, 5, -3, 6, 2 };
//		int i = linearSearch(list, 4); // 1, it searches from left to right
//		int j = linearSearch(list, -4); // -1
//		int k = linearSearch(list, -3); // 5
//		System.out.println("i: " + i);
//		System.out.println("j: " + j);
//		System.out.println("k: " + k);

		/*
		 * The linear search method compares the key with each element in the array. The
		 * elements can be in any order. On average, the algorithm will have to examine
		 * half of the elements in an array before finding the key, if it exists. Since
		 * the execution time of a linear search increases linearly as the number of
		 * array elements increases, linear search is inefficient for a large array.
		 */

		// (2) Binary Search

		/*
		 * Binary search is the other common search approach for a list of values. For
		 * binary search to work, the elements in the array must already be ordered.
		 * Assume that the array is in ascending order. The binary search first compares
		 * the key with the element in the middle of the array. Consider the following
		 * three cases
		 */
		// (a) if the key is less than the middle element, you need to continue to
		// search for the key
		// only in the first half of the array.
		// (b) if the key is equal to the middle element, the search ends with a match
		// (c) if the key is greater than the middle element, you need to continue to
		// search for the key
		// only in the second half of the array.

//		int[] list = { 2, 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
//		int i = binarySearch(list, 2); // 0
//		int j = binarySearch(list, 11); // 4
//		int k = binarySearch(list, 12); // -6
//		int l = binarySearch(list, 1); // -1
//		int m = binarySearch(list, 3); // -2
//		System.out.println("i: " + i);
//		System.out.println("j: " + j);
//		System.out.println("k: " + k);
//		System.out.println("l: " + l);
//		System.out.println("m: " + m);

		/*
		 * linear search is useful for finding an element in a small array or an
		 * unsorted array, but it is inefficient for large arrays. Binary search is more
		 * efficient, but it requires that the array be presorted.
		 */

		// Example 7.21 ???

	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; ++i)
			if (key == list[i])
				return i;
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;
	}
}
