package ch10.introduction;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer intObj = 2; // auto-boxing
		System.out.println(intObj);

		Integer[] intArray = { 1, 2, 3 }; // {new Integer(1), new Integer(2), new Integer(3)} - auto-boxing
		System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]); // auto-unboxing

		System.out.println();
		// (10.12)
		System.out.println("(10.12)");
		Integer x1 = 3 + new Integer(5);
		System.out.println(x1);

		Integer x2 = 3;
		System.out.println(x2);

		// Double x3 = 3; false

		Double x4 = 3.0;
		System.out.println(x4);

		int x5 = new Integer(3);
		System.out.println(x5);

		int x6 = new Integer(3) + new Integer(4);
		System.out.println(x6);

		System.out.println();
		// (10.13)
		System.out.println("(10.13)");
		Double x7 = 3.5;
		System.out.println(x7.intValue()); // 3
		System.out.println(x7.compareTo(4.5)); // -1
	}
}
