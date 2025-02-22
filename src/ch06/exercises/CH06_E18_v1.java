package ch06.exercises;

import java.util.Scanner;

public class CH06_E18_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = scan.next();
		System.out.println("Your password is " + checkPassword(password));

	}

	public static String checkPassword(String password) {
		boolean result = false;
		int num = 0;
		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); ++i) {
				if ((password.charAt(i) >= 48 && password.charAt(i) <= 57))
					++num;
			}
			for (int i = 0; i < password.length(); ++i) {
				if ((num >= 2
						&& ((password.charAt(i) >= 65 && password.charAt(i) <= 90)
								|| (password.charAt(i) >= 97 && password.charAt(i) <= 122))
						|| (password.charAt(i) >= 48 && password.charAt(i) <= 57))) {
					result = true;
				}
				else
					result = false;
			}
		}
		if (result == true)
			return "Valid password";
		else
			return "Invalid password";
	}
}
