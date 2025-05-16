package ch07.introduction;

import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Random;

public class Introduction {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] myArray = new double[10];

		/*
		 * (1) initializing arrays with input values: The following loop initializes the
		 * array myArray with user input values
		 */
		System.out.println("(1)");
//		for (int i = 0; i < myArray.length; ++i) {
//			System.out.print("Enter [" + i + "]: ");
//			myArray[i] = scan.nextDouble();
//		}
//		displayArray(myArray);

		/*
		 * (2) initializing arrays with random values: The following loop initializes
		 * the array myArray with random values between 0.0 and 100.0, but less than
		 * 100.0
		 */
		System.out.println("(2)");
		for (int i = 0; i < myArray.length; ++i)
			myArray[i] = random() * 100;
		displayArray(myArray);

		/*
		 * (3) Displaying arrays: To print an array, you have to print each element in
		 * the array using a loop like the following:
		 */
		System.out.println("(3)");
		displayArray(myArray);

		/*
		 * (4) Summing all elements: Use a variable named total to store the sum.
		 * İnitially total is 0. Add each element in the array to total using a loop
		 * like this
		 * 
		 */
		System.out.println("(4)");
		double total = 0.0;
		for (int i = 0; i < myArray.length; ++i)
			total += myArray[i];
		System.out.println("total: " + total);

		/*
		 * (5) Finding the largest element: Use a variable named max to store the
		 * largest element. initially max is myList[0]. To find the largest element in
		 * the array myList, compare each element with max, and update max if the
		 * element is greater than max
		 */

		System.out.println("(5)");
		double max = 0.0;
		for (int i = 0; i < myArray.length; ++i)
			if (max < myArray[i])
				max = myArray[i];
		System.out.println("max: " + max);

		/*
		 * (6) Finding the smallest index of the largest element: Often you need to
		 * locate the largest element in an array. If an array has multiple elements
		 * with the same largest value, find the smallest index of such an element.
		 * Suppose the array myList is {1, 5, 3, 4, 5, 5}. The largest element is 5 and
		 * the smallest index for 5 is 1. Use a variable named max to store the largest
		 * element and a variable named indexOfMax to denote the index of the largest
		 * element. initially max is myList[0], and indexOfMax is 0. Compare each
		 * element in myList with max, and update max and indexOfMax if the element is
		 * greater than max.
		 */
		myArray = new double[] { 1, 5, 3, 4, 5, 5, 7, 8, 8, 2 };
		System.out.println("(6)");
		int indexOfMax = 0;
		max = myArray[0];
		for (int i = 0; i < myArray.length; ++i) {
			if (max < myArray[i]) {
				max = myArray[i];
				indexOfMax = i;
			}
		}
		System.out.println("index: " + indexOfMax);

		/*
		 * (7) Random shuffling: In many applications, you need to randomly reorder the
		 * elements in an array. This is called shuffling. To accomplish this, for each
		 * element myList[i], randomly generate an index j and swap myList[i] with
		 * myList[j], as follows:
		 */

		Random rand = new Random();
		System.out.println("(7)");
		for (int i = 0; i < myArray.length; ++i) {
			int j = rand.nextInt(0, myArray.length);

			double temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
		}
		displayArray(myArray);

		/*
		 * (8) Shifting elements: Sometimes you need to shift the elements left or
		 * right. Here is an example of shifting the elements one position to the left
		 * and filling the last element with the first element:
		 */
		System.out.println("(8)");
		double temp = myArray[0];
		for (int i = 1; i < myArray.length; ++i)
			myArray[i - 1] = myArray[i];
		myArray[myArray.length - 1] = temp;
		displayArray(myArray);
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}