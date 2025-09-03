package ch11.exercises.ch11_e02;

public class Person {

	// The private instance variables
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	// Constructors

	// No-arg/Default constructor
	// +Person()
	public Person() {
		name = "none";
		address = "none";
		phoneNumber = "none";
		email = "none";
	}

	// Smart constructor
	// +Person(name: String, address: String, phoneNumber: String, email: String)
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Setter method for private instance variable 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for private instance variable 'address'
	public String getAddress() {
		return address;
	}

	// Setter method for private instance variable 'address'
	public void setAddress(String address) {
		this.address = address;
	}

	// Getter method for private instance variable 'phoneNumber'
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Setter method for private instance variable 'phoneNumber'
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Getter method for private instance variable 'email'
	public String getEmail() {
		return email;
	}

	// Setter method for private instance variable 'email'
	public void setEmail(String email) {
		this.email = email;
	}

	// toString()
	public String toString() {
		return "Person[name=" + name
				+ ",address=" + address
				+ ",phoneNumber=" + phoneNumber
				+ ",email=" + email
				+ "]";
	}
}