package ch04.exercises;

import static java.lang.Math.random;

public class CH04_E16_v1 {

	public static void main(String[] args) {
		
		do {
			String letter= (char)((int) (random() * 200)) + "";
			char letterChar = letter.charAt(0);
			if (letterChar >= 97 && letterChar <= 122) {
				System.out.println(letter.toUpperCase());
				break;
			}
		}while(true);
		
	}

}
