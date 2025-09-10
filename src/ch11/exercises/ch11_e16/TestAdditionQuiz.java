package ch11.exercises.ch11_e16;

import java.util.Scanner;
import java.util.ArrayList;

public class TestAdditionQuiz {

	public static void main(String[] args) {
		ArrayList<Integer> enteredAnswers = new ArrayList<>();
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		enteredAnswers.add(answer);
		
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if (enteredAnswers.contains(answer))
				System.out.println("You already entered " + answer);
			else 
				enteredAnswers.add(answer);
		}

		System.out.println("You got it!");
		System.out.println(enteredAnswers);
	}
}
