package ch12.introduction;

public class Questions {

	public static void main(String[] args) {
		System.out.println("12.3");
		// 12.3
		long value = Long.MAX_VALUE + 1;
		System.out.println(value);

		System.out.println("\n12.5");
		// 12.5
		try {
			int value2 = 50;
//			int value2 = 30;
			if (value2 < 40)
				throw new Exception("value is too small");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue after the catch block");

		// 12.6
		System.out.println("\n12.6");
		for (int i = 0; i < 2; i++) {
			System.out.print(i + " ");
			try {
				System.out.println(1 / 0);
			} catch (Exception ex) {
			}
		}
	}
}
