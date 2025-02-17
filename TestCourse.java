public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        course.addStudent("John Doe");
        course.addStudent("Jane Smith");
        course.addStudent("Emily Johnson");
        course.addStudent("Alice Brown");

        System.out.println("Before dropping students: " + course.getNumberOfStudents());
        
        // Display names of students before dropping
        System.out.println("Students in the course:");
        for (String student : course.getStudents()) {
            if (student != null) { // Check for non-null student names
                System.out.println(student);
            }
        }

      // Call to drop students
        

        System.out.println("After dropping students: " + course.getNumberOfStudents());

        // Display names of students after dropping
        System.out.println("Remaining students in the course:");
        for (String student : course.getStudents()) {
            if (student != null) { // Check for non-null student names
                System.out.println(student);
            }
        }
    }
}
