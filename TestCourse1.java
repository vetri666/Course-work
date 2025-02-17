public class TestCourse1 {

	public static void main(String[] args) {

		Course1 course1 = new Course1("Engineering");

		Course1 course2 = new Course1("math");



		try {

			course1.addStudent("Harry Potter");

			course1.addStudent("Tom morvolo");

			course1.addStudent("Riddle");


			course2.addStudent("ron");

			course2.addStudent("sedrick");



			System.out.println("Students in course1: " + course1.getNumberOfStudents());

			course1.printStudents();



			System.out.println("\nStudents in course2: " + course2.getNumberOfStudents());

			course2.printStudents();



			System.out.println("\nDropping Harry from course1: " +

					(course1.dropStudent("Harry") ? "dropped successfully." : "not found.") +

					"\nUpdated students in course1: " + course1.getNumberOfStudents());

			course1.printStudents();



			System.out.println("\nDropping Ron from course2: " +

					(course2.dropStudent("ron") ? "dropped successfully." : "not found.") +

					"\nUpdated students in course2: " + course2.getNumberOfStudents());

			course2.printStudents();



		} catch (IllegalArgumentException e) {

			System.err.println("Error: " + e.getMessage());

		} catch (Exception e) {

			System.err.println("Error: Please try again.");

		}

	}

}