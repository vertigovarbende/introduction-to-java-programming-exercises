package ch11.exercises.ch11_e02;

public class Staff extends Employee {

	// The private instance variable
	private String title;

	// Constructors

	// No-arg/Default constructor
	// +Staff()
	public Staff() {
		super();
		title = "non-defined";
	}

	// Smart constructor
	// +Staff(name: String, address: String, phoneNumber: String, email: String,
	// office: String, salary: double, title: String)
	public Staff(String name, String address, String phoneNumber, String email, String office, double salary,
			String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'title'
	public String getTitle() {
		return title;
	}

	// Setter method for private instance variable 'title'
	public void setTitle(String title) {
		this.title = title;
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nStaff["
				+ "title=" + title
				+ "]";
	}
}
