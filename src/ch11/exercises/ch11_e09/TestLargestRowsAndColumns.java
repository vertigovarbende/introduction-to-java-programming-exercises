package ch11.exercises.ch11_e09;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// didn't solve

public class TestLargestRowsAndColumns {

	static final Scanner INPUT = new Scanner(System.in);
	static final Random RAND = new Random();

	public static void main(String[] args) {

		System.out.print("Enter the array size: ");
		int n = INPUT.nextInt();

		ArrayList<ArrayList<Integer>> matrix = createMatrix(n);
		// matrix
		System.out.println(matrix);

	}

	public static void findLargestRowAndColumn(ArrayList<ArrayList<Integer>> matrix) {
		ArrayList<Integer> largestRow = matrix.getFirst();
		ArrayList<Integer> largestColumn = getColumn(matrix, 0);
		int countRow = countOne(largestRow);
		int countColumn = countOne(largestColumn);
		

		for (int i = 0; i < matrix.size() - 1; ++i) {
			if (countOne(matrix.get(i)) < countOne(matrix.get(i + 1))) {
				countRow = countOne(matrix.get( + 1));
				largestRow = matrix.get(i + 1);
			}
			
		}
		
	}

	public static ArrayList<Integer> getColumn(ArrayList<ArrayList<Integer>> matrix, int n) {
		ArrayList<Integer> column = new ArrayList<>();
		for (int i = 0; i < matrix.size(); ++i)
			column.add(matrix.get(i).get(n));
		return column;
	}

	public static int countOne(ArrayList<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); ++i)
			if (list.indexOf(i) == 1)
				++count;
		return count;
	}

	public static ArrayList<Integer> createArrayList(int n) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			int randNumber = RAND.nextInt(2);
			arrayList.add(randNumber);
		}
		return arrayList;
	}

	public static ArrayList<ArrayList<Integer>> createMatrix(int n) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		for (int i = 0; i < n; ++i)
			matrix.add(createArrayList(n));
		return matrix;
	}
}
