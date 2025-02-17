package GProject2;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Employee extends Staff {

	public Employee(String id) throws Exception {
		super(id, null, null, null, null, null, null, null, null);
		Employee employee = EmployeeDataAccess.getEmployeeById(id);
		if (employee == null) {
			throw new Exception("Employee not found with ID: " + id);
		}
		this.setId(employee.getId());
		this.setFirstName(employee.getFirstName());
		this.setLastName(employee.getLastName());
		this.setDateOfBirth(employee.getDateOfBirth());
		this.setAddress(employee.getAddress());
		this.setCity(employee.getCity());
		this.setState(employee.getState());
		this.setTelephone(employee.getTelephone());
		this.setEmail(employee.getEmail());
	}

	public Employee(String id, String firstName, String lastName, Date dateOfBirth, String address, String city,
			String state, String telephone, String email) {
		super(id, firstName, lastName, dateOfBirth, address, city, state, telephone, email);
	}

	@Override
	public void displayStaffInfo() {
		System.out.println(this.toString());
	}

	public int deleteEmployee() throws Exception {
		return EmployeeDataAccess.deleteEmployee(this.getId());
	}

	public int update() throws Exception {
		return EmployeeDataAccess.updateEmployee(this);
	}

	public int insert() throws Exception {
		return EmployeeDataAccess.insertEmployee(this);
	}

	public int calculateAge() {
		LocalDate birthDate = getDateOfBirth().toLocalDate();
		LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
		return Period.between(birthDate, currentDate).getYears();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}