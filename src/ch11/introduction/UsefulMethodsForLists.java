package ch11.introduction;

import java.util.Arrays;
import java.util.ArrayList;

public class UsefulMethodsForLists {

	/*
	 * Java provides the methods for creating a list from an array, for sorting a
	 * list, and finding maximum and minimum element in a list, and for shuffling a
	 * list.
	 */

	public static void main(String[] args) {

		// (1) array to array list
		/*
		 * Often you need to create an array list from an array of objects or vice
		 * versa. You can write the code using a loop to accomplish this, but an easy
		 * way is to use the methods in the Java API. Here is an example to create an
		 * array list from an array:
		 */

		/*
		 * The static method asList in the Arrays class returns a list that is passed to
		 * the ArrayList constructor for creating an ArrayList.
		 */
		String[] array1 = { "red", "green", "blue" };
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array1));
		System.out.println(list1);

		// (2) array list to array
		/*
		 * Conversely, you can use the following code to create an array of objects from
		 * an array list Invoking list.toArray(array2) copies the contents from list to
		 * array2
		 */

		String[] array2 = new String[list1.size()];
		list1.toArray(array2);
		displayArray(array2);

		// (3) sort a list
		/*
		 * If the elements in a list are comparable such as integers, double, or
		 * strings, you can use the static sort method in the java.util.Collections
		 * class to sort the elements. Here are examples
		 */

		Integer[] array3 = { 3, 5, 95, 4, 15, 34, 3, 6, 5 };
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array3));
		java.util.Collections.sort(list2);
		System.out.println(list2);

		// (4) 'max' and 'min' methods
		/*
		 * You can use the static max and min in the java.util.Collections class to
		 * return the maximum and minimal element in a list. Here are examples:
		 */

		Integer[] array4 = { 3, 5, 95, 4, 15, 34, 3, 6, 5 };
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array4));
		System.out.println(java.util.Collections.max(list3)); // 95
		System.out.println(java.util.Collections.min(list3)); // 3

		// (5) shuffle method
		/*
		 * You can use the static shuffle method in the java.util.Collections class to
		 * perform a random shuffle for the elements in a list. Here are examples:
		 */
		
		Integer[] array5 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(array5));
		java.util.Collections.shuffle(list4);
		System.out.println(list4);
	}

	public static void displayArray(String[] array) {
		for (String value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}
