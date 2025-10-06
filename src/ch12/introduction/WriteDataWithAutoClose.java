package ch12.introduction;

import java.io.*;

public class WriteDataWithAutoClose {

	public static void main(String[] args) {
		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (PrintWriter output = new PrintWriter(file)) {
			output.print("John T Smith ");
			output.print(90);
			output.print("Eric K Jones ");
			output.print(85);
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
