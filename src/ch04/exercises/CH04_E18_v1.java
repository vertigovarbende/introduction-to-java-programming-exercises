package ch04.exercises;

import java.util.Scanner;

public class CH04_E18_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter field in character: ");
		char field = scan.next().charAt(0);

		System.out.print("Enter year in character: ");
		char year = scan.next().charAt(0);

		displayDepartment(field, year);

	}

	public static void displayDepartment(char field, char year) {
		// Freshman, Sophomore, Junior, Senior
		String text = "";
		if (!yearName(year).equals("")) {
			switch (field) {
			case 'M', 'm':
				text = "Mathematics ";
				break;
			case 'C', 'c':
				text = "Computer Science ";
				break;
			case 'I', 'i':
				text = "Information Technology ";
				break;
			default:
				text = "Invalid input";
			}
		} else
			text = "You have already spent more than the maximum number of years at university. ";
		
		if (text.equals("Invalid input"))
			System.out.println(text);
		else
			System.out.println(text + yearName(year));
	}

	public static String yearName(char year) {
		String yearName = "";
		switch (year) {
		case '1':
			yearName = "Freshman";
			break;
		case '2':
			yearName = "Sophomore";
			break;
		case '3':
			yearName = "Junior";
			break;
		case '4', '5', '7':
			yearName = "Senior";
			break;
		default:
			yearName = "";
		}
		return yearName;
	}

}
