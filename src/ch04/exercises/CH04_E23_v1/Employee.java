package ch04.exercises.CH04_E23_v1;

public class Employee {

	private String firstName;
	private double workHours;
	private double payRate;
	private double federalTax;
	private double stateTax;

	public Employee() {

	}

	public Employee(String firstName, double workHours, double payRate, double federalTax, double stateTax) {
		this.firstName = firstName;
		this.workHours = workHours;
		this.payRate = payRate;
		this.federalTax = federalTax;
		this.stateTax = stateTax;
	}

	public Employee(String firstName, double workHours, double payRate) {
		this(firstName, workHours, payRate, 0.20, 0.09);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getFederalTax() {
		return federalTax;
	}

	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}

	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public double calGrossPay() {
		return workHours * payRate;
	}

	public double calFederalTax() {
		return calGrossPay() * federalTax;
	}

	public double calStateTax() {
		return calGrossPay() * stateTax;
	}

	public void printInfo() {
		System.out.println("Employee Name: " + firstName);
		System.out.println("Hours Worked: " + workHours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + calGrossPay());
		printDeduction();
	}

	private void printDeduction() {
		double fTax = calFederalTax();
		double sTax = calStateTax();
		double totalDeduction = fTax + sTax;
		System.out.println("Deductions: ");

		System.out.println("   Federal Withholding (" + (federalTax * 100) + "%): $" + fTax);
		System.out.println("   State Withholding (" + (stateTax * 100) + "%): $" + sTax);
		System.out.format("   Total Deduction: $%.2f\n", totalDeduction);
		System.out.println("Net Pay: $" + (calGrossPay() - totalDeduction));
	}

}
