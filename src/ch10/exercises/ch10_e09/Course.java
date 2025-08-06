package ch10.exercises.ch10_e09;

public class Course {

	// The private instance variables
	private String courseName;
	private String[] students;
	private int numberOfStudent;

	// The private static final variable
	public static final int DEFAULT_CAPACITY = 16;

	// Constructor

	// Smart constructor
	// +Course(courseName: String)
	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[DEFAULT_CAPACITY];
	}

	// Getter methods

	// Getter method for private instance variable 'courseName'
	public String getCourseName() {
		return courseName;
	}

	// Getter method for private instance variable 'students'
	public String[] getStudents() {
		return students;
	}

	// Getter method for private instance variable 'numberOfStudent'
	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	// +addStudent(student: String): void
	// this method adds a new student to the course
	public void addStudent(String student) {
		if (numberOfStudent >= students.length) {
			String[] temp = new String[numberOfStudent * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudent++] = student;
	}

	// +dropStudent(student: String): void
	// this method drops the student from the course
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudent; ++i) {
			if (students[i].equals(student)) {
				String tempStudent = students[numberOfStudent - 1];
				students[numberOfStudent - 1] = null;
				students[i] = tempStudent;
				--numberOfStudent;
			} else
				System.out.println("There is no such student");
		}
	}

	// +clear(): void
	// this method removes all students from the course
	public void clear() {
		students = new String[DEFAULT_CAPACITY];
		numberOfStudent = 0;
	}

	// +displayStudents(): void
	// this method displays all students
	public void displayStudents() {
//		for (String student : students)
//			System.out.println(student);
		if (numberOfStudent != 0)
			for (int i = 0; i < numberOfStudent; ++i)
				System.out.println(students[i]);
		else
			System.out.println("There is no student");
	}

	// toString()
	@Override
	public String toString() {
		return "Course[courseName=" + courseName + ",numberOfStudent=" + numberOfStudent + "]";
	}
}
