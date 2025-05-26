package ch08.exercises;

import java.util.Scanner;

public class CH08_E37_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] statesAndTheirCapitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" },
				{ "Arizona", "Phoenix" }, { "Arkansas", "Little Rock" }, { "California", "Sacramento" },
				{ "Colorado", "Denver" }, { "Connecticut", "Hartford" }, { "Delaware", "Dover" },
				{ "Florida", "Tallahassee" }, { "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" },
				{ "Illinois", "Springfield" }, { "Indiana", "Indianapolis" }, { "Iowa Des", "Moines" },
				{ "Kansas", "Topeka" }, { "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" },
				{ "Maine", "Augusta" }, { "Maryland", "Annapolis" }, { "Massachusetts", "Boston" },
				{ "Michigan", "Lansing" }, { "Minnesota", "Saint Paul" }, { "Mississippi", "Jackson" },
				{ "Missouri", "Jefferson City" }, { "Montana", "Helena" }, { "Nebraska", "Lincoln" },
				{ "Nevada", "Carson City" }, { "New Hampshire", "Concord" }, { "New Jersey", "Trenton" },
				{ "New Mexico", "Santa Fe" }, { "New York", "Albany" }, { "North Carolina", "Raleigh" },
				{ "North Dakota", "Bismarck" }, { "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" },
				{ "Oregon", "Salem" }, { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" },
				{ "South Carolina", "Columbia" }, { "South Dakota", "Pierre" }, { "Tennessee", "Nashville" },
				{ "Texas", "Austin" }, { "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" },
				{ "Virginia", "Richmond" }, { "Washington", "Olympia" }, { "West Virginia", "Charleston" },
				{ "Wisconsin", "Madison" }, { "Wyoming", "Cheyenne" } };

		startExam(statesAndTheirCapitals);
	}

	public static void startExam(String[][] statesAndTheirCapitals) {
		String checkAnswer = "";
		int correctCount = 0;

		for (int i = 0; i < statesAndTheirCapitals.length; ++i) {
			System.out.println("What is the capital of " + statesAndTheirCapitals[i][0] + "?");
			checkAnswer = INPUT.nextLine();

			if (statesAndTheirCapitals[i][1].equalsIgnoreCase(checkAnswer)) {
				System.out.println("Your answer is correct!");
				++correctCount;
			} else
				System.out.println("The correct answer should be " + statesAndTheirCapitals[i][1]);
		}

		System.out.println("The correct count is " + correctCount);
	}
}