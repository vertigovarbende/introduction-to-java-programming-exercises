package ch07.introduction;

import static java.lang.System.*;

public class CopyingArrays {

	public static void main(String[] args) {
		// There are three ways to copy arrays

		// (1) Use a loop to copy individual elements one by one

//		int[] sourceArray = {2, 3, 1, 5, 10};
//		int[] targetArray = new int[sourceArray.length];
//		for (int i = 0; i < sourceArray.length; ++i)
//			targetArray[i] = sourceArray[i];
//		
//		System.out.print("sourceArray: ");
//		displayArray(sourceArray);
//		System.out.print("targetArray: ");
//		displayArray(targetArray);

		// (2) Use the static arraycopy method in the 'System' class

//		int[] sourceArray = { 2, 3, 1, 5, 10 };
//		int[] targetArray = new int[sourceArray.length];

		// arraycopy(sourceArray, srcPos, targetArray, tarPos, length);

		// srcPos and tarPos -> indicate the starting positions in sourceArray and
		// targetArray

		// The number of elements copied from sourceArray to targetArray is indicated by
		// 'length'

//		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
//		System.out.print("sourceArray: ");
//		displayArray(sourceArray);
//		System.out.print("targetArray: ");
//		displayArray(targetArray);

		// example 7.13

//		int[] source = {3, 4, 5};
//		int[] t = new int[source.length];
//		arraycopy(source, 0, t, 0, 3);
//		System.out.print("source: ");
//		displayArray(source);
//		System.out.print("target: ");
//		displayArray(t);

		// example 7.14

//		int[] myList;
//		myList = new int[10];
//		// sometime later you want to assign a new array to myList
//		myList = new int[20];
//		displayArray(myList);

		// The size of object isn't changed! object itself is changed!
//		int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		myList = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
//		displayArray(myList);

	}

	public static void displayArray(int[] array) {
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}