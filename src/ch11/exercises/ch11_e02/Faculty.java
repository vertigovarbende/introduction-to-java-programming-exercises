package ch11.exercises.ch11_e02;

import java.util.Date;

public class Faculty extends Employee {

	// The private instance variables
	private String officeHours;
	private String rank;

	// Constructors

	// No-arg/Default constructor
	// +Faculty()
	public Faculty() {
		super();
		officeHours = "non-defined";
		rank = "non-defined";
	}

	// Smart constructor
	// +Faculty(name: String, address: String, phoneNumber: String, email: String,
	// office: String, salary: double, officeHours: String, rank: String)
	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
			String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'officeHours'
	public String getOfficeHours() {
		return officeHours;
	}

	// Setter method for private instance variable 'officeHours'
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	// Getter method for private instance variable 'rank'
	public String getRank() {
		return rank;
	}

	// Setter method for private instance variable 'rank'
	public void setRank(String rank) {
		this.rank = rank;
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nFaculty["
				+ "officeHours=" + officeHours
				+ ",rank=" + rank
				+ "]";
	}
}
