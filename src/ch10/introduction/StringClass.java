package ch10.introduction;

public class StringClass {

	/*
	 * A String object is immutable: Its content cannot be changed once the string
	 * is created.
	 */

	public static void main(String[] args) {

		// (1) Constructing a String

		System.out.println("(1) Constructing a String ");
		// 1.1
		String newString = new String("Welcome to Java");
		System.out.println(newString);
		// 1.2
		String message = "Welcome to Java";
		System.out.println(message);
		// 1.3
		char[] charArray = { 'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y' };
		String newMessage = new String(charArray);
		System.out.println(newMessage);

		System.out.println();
		// (2) Immutable Strings and Interned Strings
		// Strings are immutable; once created, their contents cannot be changed.
		System.out.println("(2) Immutable Strings and Interned Strings");
		String s = "Java"; // String s = new String("Java");
		// reference points new String object
		s = "HTML"; // s = new String("HTML");
		System.out.println(s);
		System.out.println();
		/*
		 * Because strings are immutable and are ubiquitous in programming, the JVM uses
		 * a unique instance for string literals with the same character sequence in
		 * order to improve efficiency and save memory. Such an instance is called an
		 * interned string. For example, the following statements
		 */
		System.out.println("Interned Strings");
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";

		System.out.println("s1 == s2 is " + (s1 == s2)); // false
		System.out.println("s1 == s3 is " + (s1 == s3)); // true

		System.out.println();
		// (3) Replacing and Splitting Strings
		System.out.println("(3) Replacing and Splitting Strings");
		/*
		 * Once a string is created, its contents cannot be changed. The methods
		 * replace, replaceFirst, and replaceAll return a new string derived from the
		 * original string (without changing the original string!).
		 */

		System.out.println("Welcome".replace('e', 'A')); // WAlcomA
		System.out.println("Welcome".replaceFirst("e", "AB")); // WABlcome
		System.out.println("Welcome".replace("e", "AB")); // WABlcomAB
		System.out.println("Welcome".replace("el", "AB")); // WABcome

		/*
		 * The split method can be used to extract tokens from a string with the
		 * specified delimiters. For example, the following code
		 */
		System.out.println("split");
		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		System.out.println();

		System.out.println();
		// (4) Matching, Replacing and Splitting by Patterns
		System.out.println("(4) Matching, Replacing and Splitting by Patterns");
		System.out.println("Java".matches("Java"));
		System.out.println("Java".equals("Java"));
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("Java is powerful".matches("Java.*"));
		// \\d represents a single digit, and \\d{3} represents three digits.
		System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
		String s4 = "a+b$#c".replaceAll("[$+#]", "NNN");
		System.out.println(s4); // aNNNbNNNNNNc
		String[] tokens2 = "Java,C?C#,C++".split("[.,:;?]");
		for (int i = 0; i < tokens2.length; i++)
		 System.out.println(tokens2[i]); // Java C C# C++
		
		// Conversion between Strings and Arrays
		System.out.println("Conversion between Strings and Arrays");

	}
}
