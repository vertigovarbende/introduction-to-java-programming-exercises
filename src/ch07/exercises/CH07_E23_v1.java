package ch07.exercises;

public class CH07_E23_v1 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		initializeArray(lockers);
		lockAndOpen(lockers);
		display(lockers);
	}

	public static void display(boolean[] lockers) {
		int numbersOfOpen = 0, numbersOfClosed = 0;
		System.out.println("\n\nin the end");
		for (int i = 0; i < lockers.length; ++i) {
			if (lockers[i] == true)
				++numbersOfOpen;
			else
				++numbersOfClosed;
		}
		System.out.println("The number of the open lockers are " + numbersOfOpen);
		System.out.println("The number of the closed lockers are " + numbersOfClosed);
	}

	public static void lockAndOpen(boolean[] lockers) {
		for (int i = 0; i < lockers.length; ++i) { // student
			for (int j = i; j < lockers.length; ++j) { // locker number
				if (i == 0)
					lockers[j] = true;
				else if (i == 1)
					lockers[j] = false;
				else if (j % (i + 1) == 0) {
					if (lockers[j] == true)
						lockers[j] = false;
					else
						lockers[j] = true;
				}
			}
			System.out.println();
			System.out.println("S[" + (i + 1) + "]");
			for (int k = 0; k < lockers.length; ++k) {
				System.out.print(lockers[k] + " ");
			}
				
		}
	}
	
	public static void initializeArray(boolean[] lockers) {
		for (int i = 0; i < lockers.length; ++i)
			lockers[i] = false;
	}
}