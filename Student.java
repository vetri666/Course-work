package Test;




public class Student {

	private int id;

	private String firstname;

	private String lastname;

	private double GPA;

	public Student() {

		this.id = 0;

		this.firstname = "Default fName";

		this.lastname = "default lName";

		this.GPA = 0.0;
	}

	public Student(int id, String firstname, String lastname, double GPA) {

		this.id = id;

		this.firstname = firstname;

		this.lastname = lastname;

		this.GPA = GPA;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getFirstname() {

		return firstname;
	}

	public void setFirstname(String firstname) {

		this.firstname = firstname;
	}

	public String getLastname() {

		return lastname;
	}

	public void setLastname(String lastname) {

		this.lastname = lastname;
	}

	public double getGPA() {

		return GPA;
	}

	public void setGPA(double GPA) {

		this.GPA = GPA;
	}

	public void IncreaseGPA(double value) {

		GPA += value;
	}

	public static void main(String[] args) {

		Student student = new Student(12, "Emma", "Lintt", 3.65);

		System.out.println("Student Details:");

		System.out.println("ID: " + student.getId());

		System.out.println("First Name: " + student.getFirstname());

		System.out.println("Last Name: " + student.getLastname());

		System.out.println("GPA: " + student.getGPA());

		student.IncreaseGPA(0.2);

		System.out.println("\nAfter Increasing GPA");

		System.out.println("New GPA: " + student.getGPA());
	}
}



