package ch11.exercises.ch11_e05;

import java.util.ArrayList;
import java.util.List;

public class Course {

	// The private instance variables
	private String courseName;
	private List<String> students;

	// Constructor

	// Smart constructor
	// +Course(courseName: String)
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// Getter methods

	// Getter method for private instance variable 'courseName'
	public String getCourseName() {
		return courseName;
	}

	// Getter method for private instance variable 'students'
	public List<String> getStudents() {
		return students;
	}

	// Getter method for private instance variable 'numberOfStudent'
	public int getNumberOfStudent() {
		return students.size();
	}

	// +addStudent(student: String): void
	// this method adds a new student to the course
	public void addStudent(String student) {
		students.add(student);
	}

	// +dropStudent(student: String): void
	// this method drops the student from the course
	public void dropStudent(String student) {
		if (students.contains(student))
			students.remove(student);
		else
			System.out.println("There is no such student");
	}

	// +clear(): void
	// this method removes all students from the course
	public void clear() {
		students.clear();
	}

	// +displayStudents(): void
	// this method displays all students
	public void displayStudents() {
		if (!students.isEmpty())
			for (String student : students)
				System.out.println(student);
		else
			System.out.println("There is no student");
	}

	// toString()
	@Override
	public String toString() {
		return "Course[courseName=" + courseName + ",numberOfStudent=" + students.size() + "]";
	}
}
