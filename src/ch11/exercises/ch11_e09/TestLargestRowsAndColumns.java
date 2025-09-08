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
		ArrayList<Integer> largestColumn = new ArrayList<>();
		for (int i = 0; i < matrix.size(); ++i) 
			largestColumn.add(matrix.get(i).get(0));
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
