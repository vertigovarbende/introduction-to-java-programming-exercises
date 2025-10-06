package ch12.introduction;

import java.util.Scanner;
import java.io.*;

public class ReadData {

	public static void main(String[] args) {
		File file = new File("scores.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
			while (input.hasNext()) {
				String firstName = input.next();
				String mi = input.next();
				String lastName = input.next();
				int score = input.nextInt();
				System.out.println(firstName + " " + lastName + " " + score);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			input.close();
		}
	}
}
