package ch11.exercises.ch11_e05;

import ch10.exercises.ch10_e09.Course;

public class TestCourse {

	public static void main(String[] args) {
		// constructor, toString()
		Course course1 = new Course("A");
		System.out.println(course1);

		// addStudent()
		course1.addStudent("a1");
		System.out.println(course1);
		System.out.println(course1.getNumberOfStudent());

		// dropStudent()
		course1.dropStudent("a1");
		System.out.println(course1);
		System.out.println(course1.getNumberOfStudent());

		// addStudent()
		for (int i = 0; i < 16; ++i)
			course1.addStudent((char) (i + 97) + "1");

		System.out.println();
		course1.displayStudents();
		System.out.println(course1);
		System.out.println(course1.getNumberOfStudent());

		// addStudent()
		System.out.println();
		course1.addStudent("r1");
		course1.displayStudents();
		System.out.println(course1);
		System.out.println(course1.getNumberOfStudent());

		// clear()
		System.out.println();
		course1.clear();
		course1.displayStudents();
		System.out.println(course1);
		System.out.println(course1.getNumberOfStudent());
	}
}
