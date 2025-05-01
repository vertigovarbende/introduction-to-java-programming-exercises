package ch07.exercises;

import java.util.Random;

public class CH07_E16_v1 {

	static final Random RAND = new Random();
	static final int SIZE = 100_000;
	
	public static void main(String[] args) {
		int[] array = new int[SIZE];
		
		// linearSearch
		long startTime1 = System.currentTimeMillis();
		int index1 = linearSearch(array, randomKey());
		long endTime1 = System.currentTimeMillis();
		long executionTime1 = endTime1 - startTime1;
		System.out.println("executionTime1 is " + executionTime1);
		
		// binarySearch
		long startTime2 = System.currentTimeMillis();
		sort(array);
		int index2 = binarySearch(array, randomKey());
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		System.out.println("executionTime2 is " + executionTime2);
		
	}
	
	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			array[i] = RAND.nextInt(SIZE);
	}
	
	public static int randomKey() {
		return RAND.nextInt(SIZE);
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
	
	public static int[] sort(int[] list) {
		for (int i = 0; i < list.length - 1; ++i) {
			for (int j = i + 1; j < list.length; ++j) {
				if (list[i] > list[j]) {
					int temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
	}
}