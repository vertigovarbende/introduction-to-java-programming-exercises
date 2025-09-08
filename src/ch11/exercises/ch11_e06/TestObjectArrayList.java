package ch11.exercises.ch11_e06;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ch10.introduction.Loan;
import ch11.exercises.ch11_e01.Triangle;

public class TestObjectArrayList {

	public static void main(String[] args) {
	
		List<Object> myArrayList = new ArrayList<>();
		myArrayList.add(new Date());
		myArrayList.add(new Triangle(3, 4, 5));
		myArrayList.add(new Loan(1.3, 2, 15_000));
		myArrayList.add("vertigovarbende");
		
		System.out.println(myArrayList);
		
		System.out.println();
		
		for(Object obj: myArrayList) 
			System.out.println(obj); // invoke to obj.toString()
		
		System.out.println();
		
		for(Object obj: myArrayList) {
			if (obj instanceof Date e)
				System.out.println("Date\n" + e);
			else if (obj instanceof Triangle e)
				System.out.println("Triangle\n" + e);
			else if (obj instanceof Loan e)
				System.out.println("Loan\n" + e);
			else if (obj instanceof String e)
				System.out.println("String\n" + e);
		}
	}
}
