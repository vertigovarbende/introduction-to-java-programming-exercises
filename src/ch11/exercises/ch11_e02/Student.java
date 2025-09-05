package ch11.exercises.ch11_e02;

public class Student extends Person {
	
	// The private final instance variables
	final private String STATUS;

	// Constructors
	
	// No-arg/Default constructor
	// +Student()
	public Student() {
		super();
		STATUS = "non-defined";
	}
	
	// Smart constructor
	// +Student(name: String, address: String, phoneNumber: String, email: String, STATUS: String)
	public Student(String name, String address, String phoneNumber, String email, String STATUS) {
		super(name, address, phoneNumber, email);
		this.STATUS = STATUS;
	}

	// Getter method for private final instance variable 'STATUS'
	public String getSTATUS() {
		return STATUS;
	}
	
	// toString() 
	@Override
	public String toString() {
		return super.toString() + "\nStudent["
				+ "STATUS=" + STATUS
				+ "]";
	}
}
