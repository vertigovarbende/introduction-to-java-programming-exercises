package ch11.exercises.ch11_e07;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShuffleArrayList {

	public static void main(String[] args) {
		
		Integer[] array = { 3, 5, 95, 4, 15, 34, 3, 6, 5 };
		ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(array));
		shuffle(myArrayList);
		System.out.println(myArrayList);
	}
	
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
}
