package ch09.exercises.ch09_e08;

public class TestFan {

	public static void main(String[] args) {
		
		Fan fanObj1 = new Fan(3, true, 10, "yellow");
		Fan fanObj2 = new Fan();
		fanObj2.setSpeed(2);
		
		System.out.println(fanObj1); // invoke fanObj1.toString()
		System.out.println(fanObj2); // invoke fanObj2.toString()
		
		// test setSpeed()
		fanObj1.setSpeed(1);
		System.out.println(fanObj1);
		fanObj1.setSpeed(2);
		System.out.println(fanObj1);
		fanObj1.setSpeed(3);
		System.out.println(fanObj1);
		
		fanObj1.setSpeed(4);
	}
}
