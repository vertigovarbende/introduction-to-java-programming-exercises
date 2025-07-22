package ch10.exercises.ch10_e03;

public class TestMyInteger {

	public static void main(String[] args) {
		
		// Test constructor and toString() method
		MyInteger myObj = new MyInteger(2);
		MyInteger myObj2 = new MyInteger(3);
		
		System.out.println("myObj-" + myObj);
		System.out.println("myObj2-" + myObj2);
		System.out.println();
		
		
		// Test isEven() method
		System.out.println("isEven()");
		System.out.println(myObj.isEven() == true);
		System.out.println(myObj2.isEven() == false);
		System.out.println();
		
		// Test isOdd() method
		System.out.println("isOdd()");
		System.out.println(myObj.isOdd() == false);
		System.out.println(myObj2.isOdd() == true);
		System.out.println();
		
		// Test isPrime() method
		System.out.println("isPrime()");
		System.out.println(myObj.isPrime() == true);
		System.out.println(myObj2.isPrime() == true);
		System.out.println();
		
		// Test isEven(int) method
		System.out.println("isEven(int)");
		System.out.println(MyInteger.isEven(4) == true);
		System.out.println(MyInteger.isEven(5) == false);
		System.out.println();
		
		// Test isOdd(int) method
		System.out.println("isOdd(int)");
		System.out.println(MyInteger.isOdd(8) == false);
		System.out.println(MyInteger.isOdd(9) == true);
		System.out.println();
		
		// Test isPrime(int) method
		System.out.println("isPrime(int)");
		System.out.println(MyInteger.isPrime(0) == false);
		System.out.println(MyInteger.isPrime(1) == false);
		System.out.println(MyInteger.isPrime(3) == true);
		System.out.println(MyInteger.isPrime(11) == true);
		System.out.println();
		
		// Test equals(int) method
		System.out.println("equals(int)");
		System.out.println(myObj.equals(2) == true);
		System.out.println(myObj.equals(3) == false);
		System.out.println();
		
		// Test equals(MyInteger) methood
		System.out.println("equals(MyInteger)");
		System.out.println(myObj.equals(myObj2) == false);
		System.out.println();
		
		// Test parseInt(char[]) method
		System.out.println("parseInt(char[])");
		System.out.println(MyInteger.parseInt(new char[] {'1'}));
		System.out.println(MyInteger.parseInt(new char[] {'5'}));
		System.out.println(MyInteger.parseInt(new char[] {'9'}));
		System.out.println();
		
		// Test parseInt(String) method
		System.out.println("parseInt(String)");
		System.out.println(MyInteger.parseInt("142"));
		System.out.println(MyInteger.parseInt("24"));
		System.out.println(MyInteger.parseInt("12"));
	}
}