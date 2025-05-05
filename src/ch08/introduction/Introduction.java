package ch08.introduction;

public class Introduction {

	/*
	 * Data in a table or a matrix can be represented using a two-dimensional array
	 */

	public static void main(String[] args) {

		double[][] distances = { { 0, 983, 787, 714, 1375, 967, 1087 }, { 983, 0, 214, 1102, 1763, 1723, 1842 },
				{ 787, 214, 0, 888, 1549, 1548, 1627 }, { 714, 1102, 888, 0, 661, 781, 810 },
				{ 1375, 1763, 1549, 661, 0, 1426, 1187 }, { 967, 1723, 1548, 781, 1426, 0, 239 },
				{ 1087, 1842, 1627, 810, 1187, 239, 0 }, };

		displayTable(distances);
	}

	public static void displayTable(double[][] distances) {
		String[] header = { "Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston" };
		printHypen(71);
		System.out.print("\t     ");
		for (int i = 0; i < header.length; ++i)
			System.out.print(header[i] + "  ");
		System.out.println();
		printHypen(71);
		for (int i = 0; i < header.length; ++i) {
			System.out.print(header[i] + "   ");
			displayRow(distances[i]);
			System.out.println();
		}
	}

	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}

	public static void displayRow(double[] distance) {
		for (int i = 0; i < distance.length; ++i) {
			System.out.print("\t");
			System.out.print(distance[i] + " ");
		}
	}
}