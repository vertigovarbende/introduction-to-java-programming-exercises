package ch07.introduction;

import java.lang.System;

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

	}

	public static void displayArray(int[] array) {
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}