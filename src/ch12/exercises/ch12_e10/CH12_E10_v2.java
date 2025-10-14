package ch12.exercises.ch12_e10;

public class CH12_E10_v2 {

	public static void main(String[] args) {
		
		// StackOverflowError
		
		try {
			recursiveMethod(1);
		} catch (StackOverflowError err) {
			System.out.println("You fucked up the stack memory!");
			System.out.println("cause: " + err);
		}
	}
	
	public static void recursiveMethod(int depth) {
		System.out.println("depth: " + depth);
		recursiveMethod(depth + 1);
	}
}
