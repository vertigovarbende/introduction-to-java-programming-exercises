package ch07.introduction;

public class ReturningAnArrayFromAMethod {

	// "When a method returns an array, the reference of the array is returned."
	public static void main(String[] args) {

		// A method may also return an array.

//		int[] list1 = {1, 2, 3, 4, 5, 6};
//		int[] list2 = reverse(list1);
//		System.out.print("list1: ");
//		displayArray(list1);
//		System.out.print("list2: ");
//		displayArray(list2);

		// example 7.15
		// because loop works 5 times!
		// solution
//		int[] list = { 1, 2, 3, 5, 4 };
//		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
//			int temp = list[i];
//			list[i] = list[j];
//			list[j] = temp;
//		}
//		System.out.print("list: ");
//		displayArray(list);

	}

	// (0)
	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// (1)
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; ++i, --j)
			result[j] = list[i];
		return result;
	}

}