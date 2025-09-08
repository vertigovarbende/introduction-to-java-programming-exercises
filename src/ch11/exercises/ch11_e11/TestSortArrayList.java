package ch11.exercises.ch11_e11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestSortArrayList {

	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myArrayList = new ArrayList<>();
		System.out.println("Enter 5 integer number");
		for (int i = 0; i < 5; ++i) 
			myArrayList.add(INPUT.nextInt());
		sort(myArrayList);
		System.out.println(myArrayList);
		
	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}
