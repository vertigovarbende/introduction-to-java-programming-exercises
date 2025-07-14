package ch09.exercises.ch09_e06;

import java.util.Random;

public class TestStopWatch {

	static final Random RAND = new Random();

	public static void main(String[] args) {

		StopWatch myStopWatch = new StopWatch();
		int[] array = new int[100_000];
		initializeArray(array);
//		displayArray(array);
		
		myStopWatch.start();
		selectionSort(array);
		myStopWatch.stop();
		displayArray(array);
		System.out.println(
				"\nexecution time of sorting 100_000 numbers using selection sort: " + myStopWatch.getElapsedTime());

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

	public static void initializeArray(int[] array) {
		for (int i = 0; i < 100_000; ++i)
			array[i] = RAND.nextInt(1000);
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			if (i != 0 && i % 10 != 0)
				System.out.print(array[i] + " ");
			else
				System.out.println();
		}
	}
}
