package ch11.exercises.ch11_e14;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCombineTwoLists {

	static int listNumber;
	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		initializeList(list1);
		initializeList(list2);
		
		ArrayList<Integer> unionList = union(list1, list2);
		System.out.println("The combined list is " + unionList);
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> unionList = new ArrayList<>();
		unionList.addAll(list1);
		unionList.addAll(list2);
		return unionList;
	}
	
	public static void initializeList(ArrayList<Integer> list) {
		++listNumber;
		System.out.print("Enter five integers for list" + listNumber + ": ");
		for (int i = 0; i < 5; ++i)
			list.add(INPUT.nextInt());
	}
}
