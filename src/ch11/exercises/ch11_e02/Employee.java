package ch11.exercises.ch11_e02;

import java.util.Date;

public class Employee extends Person {

	// The private instance variables
	private String office;
	private double salary;
	private Date dateHired;

	// Constructors

	// No-arg/Default constructor
	// +Employee()
	public Employee() {
		super();
		office = "none";
		salary = 0.0;
		dateHired = new Date();
	}

	// Smart constructor
	// +Employee(name: String, address: String, phoneNumber: String, email: String,
	// office: String, salary: double)
	public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		dateHired = new Date();
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'office'
	public String getOffice() {
		return office;
	}

	// Setter method for private instance variable 'office'
	public void setOffice(String office) {
		this.office = office;
	}

	// Getter method for private instance variable 'salary'
	public double getSalary() {
		return salary;
	}

	// Setter method for private instance variable 'salary'
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Getter method for private instance variable 'dateHired'
	public Date getDateHired() {
		return dateHired;
	}

	// Setter method for private instance variable 'dateHired'
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nEmployee["
				+ "office=" + office
				+ ",salary=" + salary
				+ ",dateHired=" + dateHired
				+ "]";
	}
}
