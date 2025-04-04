package ch07.introduction;

public class VariableLengthArgumentLists {

	// "A variable number of arguments of the same type can be passed to a method
	// and treated as an array."

	public static void main(String[] args) {

		/*
		 * in the method declaration, you specify the type followed by an ellipsis
		 * (...), Only one variable-length parameter may be specified in a method, and
		 * this parameter must be the last parameter. Any regular parameters must
		 * precede it.
		 */

		/*
		 * Java treats a variable-length parameter as an array. You can pass an array or
		 * a variable number of arguments to a variable-length parameter. When invoking
		 * a method with a variable number of arguments, Java creates an array and
		 * passes the arguments to it.
		 */

		// Listing 7.5 - VarArgsDemo.java
//		printMax(34, 3, 3, 2, 56.5);
//		printMax(new double[] { 1, 2, 3 });
//		printMax();

		// Example 7.19
		// 1 -> you cannot define 2 var-length arguments in one method argument list
		// 2 -> if you want to define var-length argument, it should be last argument in
		// the method arguemnt list
		// 3 -> you cannot define a method with var-length argument

		// Example 7.20
//		printMax(1, 2, 2, 1, 4);
//		printMax(new double[] { 1, 2, 3 });
		// Error!
//		printMax(new int[] {1, 2, 3}); you have to define var-length argument as an int ... numbers

	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}

		double max = numbers[0];

		for (int i = 0; i < numbers.length; ++i)
			if (max < numbers[i])
				max = numbers[i];
		System.out.println("The max value is " + max);
	}

}
