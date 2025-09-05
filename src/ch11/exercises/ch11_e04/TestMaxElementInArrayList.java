package ch11.exercises.ch11_e04;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class TestMaxElementInArrayList {

	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		Integer[] array1 = { 99, 12, 95, -12, 15, 34, 3, 7, 5 };
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		System.out.println(max(list1));
		
		list1 = new ArrayList<Integer>();
		
		int number = 0;
		
		while (true) {
			System.out.print("number: ");
			number = INPUT.nextInt();
			if (number == 0) {
				break;
			}
			list1.add(number);
		}
		
		System.out.println(list1);
		System.out.println("max: " + max(list1));
		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if (list != null && list.size() != 0)
			return java.util.Collections.max(list);
		return null;
	}
}
