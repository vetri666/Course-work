package GProject2;

import java.sql.Date;

public abstract class Staff implements Comparable<Staff>, Cloneable {
	private String id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String address;
	private String city;
	private String state;
	private String telephone;
	private String email;

	public Staff(String id, String firstName, String lastName, Date dateOfBirth, String address, String city,
			String state, String telephone, String email) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setAddress(address);
		setCity(city);
		setState(state);
		setTelephone(telephone);
		setEmail(email);
	}

	// Getter and setter methods

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("ID cannot be null or empty.");
		}
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.isBlank()) {
			throw new IllegalArgumentException("First name cannot be empty.");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.isBlank()) {
			throw new IllegalArgumentException("Last name cannot be empty.");
		}
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.isBlank()) {
			throw new IllegalArgumentException("Email cannot be empty.");
		}
		this.email = email;
	}

	// Abstract method
	public abstract void displayStaffInfo();

	@Override
	public int compareTo(Staff other) {
		return this.id.compareTo(other.id);
	}

	@Override
	public String toString() {
		return "ID: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nDate of Birth: "
				+ dateOfBirth + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state + "\nTelephone: "
				+ telephone + "\nEmail: " + email;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}