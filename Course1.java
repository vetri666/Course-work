

import java.util.ArrayList;



public class Course1 {

	private String courseName;

	private ArrayList<String> students = new ArrayList<>();



	public Course1(String courseName) {

		this.courseName = courseName;

	}



	public void setCourseName(String courseName) {

		if (courseName == null || courseName.isEmpty()) {

			throw new IllegalArgumentException("Course name cannot be null or empty.");

		}

		this.courseName = courseName;

	}



	public void addStudent(String student) {

		if (student == null || student.isEmpty()) {

			throw new IllegalArgumentException("Student name cannot be null or empty.");

		}

		students.add(student);

	}



	public String[] getStudents() {

		return students.toArray(new String[0]);

	}



	public int getNumberOfStudents() {

		return students.size();

	}



	public String getCourseName() {

		return courseName;

	}



	public boolean dropStudent(String student) {

		if (student == null || student.isEmpty()) {

			throw new IllegalArgumentException("Student name cannot be null or empty.");

		}

		return students.remove(student);

	}



	public void printStudents() {

		if (students.isEmpty()) {

			System.out.println("No students enrolled in this course.");

			return;

		}



		System.out.println("Students enrolled in " + courseName + ":");

		for (int i = 0; i < students.size(); i++) {

			System.out.println((i + 1) + ". " + students.get(i));

		}

	}

}