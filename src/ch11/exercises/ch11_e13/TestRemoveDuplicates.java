package ch11.exercises.ch11_e13;

import java.util.ArrayList;
import java.util.Scanner;

public class TestRemoveDuplicates {

	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> myArrayList = new ArrayList<>();
		System.out.println("Enter 10 integers");
		for (int i = 0; i < 10; ++i) 
			myArrayList.add(INPUT.nextInt());
		removeDuplicate(myArrayList);
		}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> rList = new ArrayList<>();
		int i = 0;
		while(true) {
			int value = list.get(i);
			if (!rList.contains(value))
				rList.add(value);
			++i;
			if (i == list.size() - 1)
				break;
		}
		System.out.println("The distinct integers are " + rList);
	}
}