package ch07.introduction;

import static java.util.Arrays.*;

public class ArraysClass {

	/*
	 * The java.util.Arrays class contains useful methods for common array
	 * operations such as sorting and searching
	 */
	public static void main(String[] args) {

		/*
		 * The 'java.util.Arrays' class contains various static methods for 
		 * - sorting,
		 * - searching arrays,
		 * - comparing arrays,
		 * - filling array elements,
		 * - returning a string representation of the array.
		 * These methods are overloaded for all primitive types.
		 * 
		 * */
		
		
		// (1) 'sort()' or 'parallelSort()'
		// You can use these methods to sort a whole array or a partial array.
		// parallelSort is more efficient if your computer has multiple processors.
		System.out.println("(1) sort() and parallelSort()");
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		sort(numbers);
		displayArray(numbers);
		
		numbers = new double[] {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		parallelSort(numbers);
		displayArray(numbers);
		
		char[] chars = {'a', 'A', '4', 'F', 'D', 'p'};
		sort(chars, 0, 2); // begin inclusive, end exclusive
		displayArray(chars);
		
		
		// (2) binarySearch()
		// You can use binarySearch() method to search for a key in an array. The array must be
		// pre-sorted in increasing order! If the key is not in the array, the method returns
		// '-(insertionIndex + 1)'.
		System.out.println("(2) binarySearch()");
		int[] array = {10, 11, 7, 4, 2, 45, 59, 50, 79, 66, 69, 70, 60};
		parallelSort(array); // or sort(array)
		System.out.println("index of '11': " + binarySearch(array, 11));
		System.out.println("index of '12': " + binarySearch(array, 12)); // -6
		
		char[] chars2 = {'g', 'x', 'y', 'a', 'c', 'z'};
		parallelSort(chars2); // or sort(chars2)
		System.out.println("index of 'a': " + binarySearch(chars2, 'a'));
		System.out.println("index of 't': " + binarySearch(chars2, 't')); // 4
		
		// (3) equals()
		// You can use the equals() method to check whether two arrays are strictly equal. Two arrays
		// are strictly equal if their corresponding elements are the same.
		System.out.println("(3) equals()");
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		System.out.println(java.util.Arrays.equals(list1, list2)); // true
		System.out.println(java.util.Arrays.equals(list2, list3)); // false
		
		// (4) fill()
		// You can use the fill() method in all or part of the array.
		System.out.println("(3) fill()");
		int[] list4 = {2, 4, 7, 10};
		int[] list5 = {2, 4, 7, 7, 7, 10};
		fill(list4, 5);
		fill(list5, 1, 5, 8); // array, begin(inc.), end(exc.), fill
		displayArray(list4);
		displayArray(list5);
		
		// (5)
		// You can also use the 'toString' method to return a string that represents all elements
		// in the array.
		System.out.println("(5) toString()");
		int[] list6 = {2, 4, 7, 10};
		System.out.println(java.util.Arrays.toString(list6));
		
		// 7.26
		// we can check using member access '.'
		// int, short, long, float, double, char, <T> generics, Objects ...
		// It doesn't create a new array. sort() and parallelSort() methods use an array that already
		// created.
		
		// 7.27
		// array should be sorted in increasing order otherwise binarySearch algorithm doesn't work
		// very well
		
		// 7.28
		// list1 --> 7, 7, 7, 7, --> [7, 7, 7, 7]
		// list2 --> [2, 4, 7, 10]
		// false
	
	}

	public static void displayArray(char[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}