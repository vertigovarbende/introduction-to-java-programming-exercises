package ch05.exercises;

public class CH05_E43_v1 {

	public static void main(String[] args) {

		int totalNumber = 0;
		for (int i = 1; i <= 7; ++i) {
			System.out.print(i + "\n" + "-\n");
			for (int j = i + 1; j <= 7; ++j) {
				System.out.println(i + " " + j);
				++totalNumber;
			}
			System.out.println();
		}

		System.out.println("The total number of all combinations is " + totalNumber);
		
	}

}
