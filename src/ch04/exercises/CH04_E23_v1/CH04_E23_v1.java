package ch04.exercises.CH04_E23_v1;

import java.util.Scanner;

public class CH04_E23_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee empObj = new Employee();

		System.out.print("Enter employee's name: ");
		empObj.setFirstName(scan.next());
		
		System.out.print("Enter number of hours worked in a week: ");
		empObj.setWorkHours(scan.nextDouble());
		
		System.out.print("Enter hoursly pay rate: ");
		empObj.setPayRate(scan.nextDouble());
		
		System.out.print("Enter federal tax withholding rate: ");
		empObj.setFederalTax(scan.nextDouble());
		
		System.out.print("Enter state tax withholding rate: ");
		empObj.setStateTax(scan.nextDouble());
		
		System.out.println();
		empObj.printInfo();

	}

}
