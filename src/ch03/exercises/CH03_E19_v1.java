package ch03.exercises;

import java.util.*;

public class CH03_E19_v1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] kenarUzunluklari = new int[3];
		fillKenar(kenarUzunluklari, scan);
		
		if (calPerimeter(kenarUzunluklari) == 0)
			System.out.println("Gecersiz uzunluk degeri");
		else 
			System.out.println("Cevre: " + calPerimeter(kenarUzunluklari));

	}

	public static void fillKenar(int[] kenarUzunluklari, Scanner scan) {
		char kenar = 'a';
		for (int i = 0; i < kenarUzunluklari.length; ++i) {
			System.out.print("Enter " + kenar + ": ");
			kenarUzunluklari[i] = scan.nextInt();
			++kenar;
		}
	}

	public static boolean IsValid(int[] A) {
		// 1-2 > 3 1-3 > 2 2-3 > 1
		if ((A[0] + A[1] > A[2]) && (A[0] + A[2] > A[1]) && (A[1] + A[2] > A[0]))
			return true;
		else 
			return false;
	}
	
	public static int calPerimeter(int[] A) {
		int perimeterOfTriangle = 0;
		if (IsValid(A)) {
			for (int i = 0; i < A.length; ++i)
				perimeterOfTriangle += A[i];
			return perimeterOfTriangle;
		}
		else 
			return 0;
	}

}
