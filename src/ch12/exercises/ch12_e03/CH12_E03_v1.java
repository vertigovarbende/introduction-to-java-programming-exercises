package ch12.exercises.ch12_e03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CH12_E03_v1 {

	public static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		int[] randArray = createArray();
		boolean isValid = false;

		while (!isValid) {
			try {
				System.out.print("Enter the index: ");
				int index = INPUT.nextInt();
				System.out.println("The value is " + randArray[index]);
				isValid = true;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex);
			} catch (InputMismatchException ex) {
				System.out.println(ex);
				System.out.println("Please enter the index again");
				INPUT.nextLine();
			}
		}

		displayArray(randArray);
	}

	public static int[] createArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; ++i)
			array[i] = (int) (Math.random() * 100);
		return array;
	}

	public static void displayArray(int[] array) {
		int count = 0;
		for (int value : array) {
			System.out.print(value + " ");
			++count;
			if (count % 10 == 0)
				System.out.println();
		}
	}
}
