package GProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataAccess {
	private static Connection getConnection() throws Exception {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/EmployeeManagementSystem?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
				"root", "240827"); // Update your DB user and password
	}

	public static Employee getEmployeeById(String employeeId) throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		String strSelect = "SELECT * FROM Staff WHERE id = '" + employeeId + "'";
		ResultSet rset = stmt.executeQuery(strSelect);

		Employee employee = null;
		if (rset.next()) {
			employee = new Employee(rset.getString("id"), rset.getString("firstName"), rset.getString("lastName"),
					rset.getDate("dateOfBirth"), rset.getString("address"), rset.getString("city"),
					rset.getString("state"), rset.getString("telephone"), rset.getString("email"));
		}

		conn.close();
		return employee;
	}

	public static List<Employee> getAllEmployees() throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		String strSelect = "SELECT * FROM Staff";
		ResultSet rset = stmt.executeQuery(strSelect);

		List<Employee> employees = new ArrayList<>();
		while (rset.next()) {
			Employee employee = new Employee(rset.getString("id"), rset.getString("firstName"),
					rset.getString("lastName"), rset.getDate("dateOfBirth"), rset.getString("address"),
					rset.getString("city"), rset.getString("state"), rset.getString("telephone"),
					rset.getString("email"));
			employees.add(employee);
		}

		conn.close();
		return employees;
	}

	public static int deleteEmployee(String employeeId) throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		String sqlStmt = "DELETE FROM Staff WHERE id = '" + employeeId + "'";
		int rowCount = stmt.executeUpdate(sqlStmt);

		conn.close();
		return rowCount;
	}

	public static int updateEmployee(Employee employee) throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		String sqlStmt = "UPDATE Staff SET firstName = '" + employee.getFirstName() + "', lastName = '"
				+ employee.getLastName() + "', dateOfBirth = '" + employee.getDateOfBirth() + "', address = '"
				+ employee.getAddress() + "', city = '" + employee.getCity() + "', state = '" + employee.getState()
				+ "', telephone = '" + employee.getTelephone() + "', email = '" + employee.getEmail() + "' WHERE id = '"
				+ employee.getId() + "'";

		int rowCount = stmt.executeUpdate(sqlStmt);
		conn.close();
		return rowCount;
	}

	public static int insertEmployee(Employee employee) throws Exception {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		String sqlStmt = "INSERT INTO Staff (id, firstName, lastName, dateOfBirth, address, city, state, telephone, email) VALUES ('"
				+ employee.getId() + "', '" + employee.getFirstName() + "', '" + employee.getLastName() + "', '"
				+ employee.getDateOfBirth() + "', '" + employee.getAddress() + "', '" + employee.getCity() + "', '"
				+ employee.getState() + "', '" + employee.getTelephone() + "', '" + employee.getEmail() + "')";

		int rowCount = stmt.executeUpdate(sqlStmt);
		conn.close();
		return rowCount;
	}
}