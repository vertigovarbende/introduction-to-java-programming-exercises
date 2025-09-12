package ch11.exercises.ch11_e10;

import java.util.Scanner;

public class TestMyStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		MyStack stack = new MyStack();

		System.out.println("Enter 5 strings:");
		for (int i = 0; i < 5; i++) {
			String s = input.nextLine();
			stack.push(s);
		}

		System.out.println("\nStrings in reverse order:");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		input.close();
	}
}
