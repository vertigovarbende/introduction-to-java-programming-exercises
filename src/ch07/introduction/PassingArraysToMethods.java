package ch07.introduction;

public class PassingArraysToMethods {

	// "When passing an array to a method, the reference of the array is passed to
	// the method."
	public static void main(String[] args) {

		// (1) anonymous array
		// new elementType[]{value0, value1, ..., valuek};
		/*
		 * There is no explicit reference variable for the array. Such array is called
		 * an "anonymous array"
		 */

		// (2) pass-by-value and pass-by-sharing

		/*
		 * For an argument of an array type, the value of the argument is a reference to
		 * an array; this reference value is passed to the method. Semantically, it can
		 * be best described as pass-by-sharing, that is, the array in the method is the
		 * same as the array being passed. Thus, if you change the array in the method,
		 * you will see the change outside the method. That the following code, for
		 * example
		 */

//		int x = 1;
//		int[] y = new int[10];
//		
//		m(x, y); // invoke m with arguments x and y
//		
//		System.out.println("x is: " + x);
//		System.out.println("y[0] is: " + y[0]);

		// another example

		int[] a = { 1, 2 };

		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swap(a[0], a[1]); // false swap
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");

		System.out.println();

		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a); // true swap
		System.out.println("After invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");

	}

	// (0)
	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// (2)
	public static void m(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 5555;
	}

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}

	public static void swapFirstTwoInArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}

}