package ch12.introduction;

import java.io.*;

public class WriteData {

	public static void main(String[] args) {
		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		PrintWriter output = null;
		try {
			output = new PrintWriter(file);
			output.print("John T Smith ");
			output.print(90);
			output.print("Eric K Jones ");
			output.println(85);
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (!output.equals(null)) 
				output.close();
		}
		
		
		
	}
}
