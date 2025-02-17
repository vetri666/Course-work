package GProject2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagerClient {
	private static HashMap<String, Staff> staffData = new HashMap<>();

	public static void main(String[] args) {
		// Load initial data from the database
		try {
			loadInitialData();
		} catch (Exception e) {
			System.out.println("Error loading initial data: " + e.getMessage());
		}

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("===== Employee Manager =====");
				System.out.println("1. Insert a new employee");
				System.out.println("2. Update an existing employee");
				System.out.println("3. Delete an employee");
				System.out.println("4. View all employees");
				System.out.println("5. View employee by ID");
				System.out.println("6. View employees sorted by age");
				System.out.println("7. Exit");
				System.out.print("Enter your choice: ");
				int choice = validateMenuOption(scanner);

				switch (choice) {
				case 1: // Insert a new employee
					Employee newEmployee = createEmployee(scanner);
					System.out.print("Are you sure you want to insert this employee? (yes/no): ");
					if (scanner.nextLine().equalsIgnoreCase("y")) {
						int insertCount = newEmployee.insert();
						if (insertCount > 0) {
							staffData.put(newEmployee.getId(), newEmployee);
							System.out.println("Employee inserted successfully!");
						} else {
							System.out.println("Employee insertion failed.");
						}
					} else {
						System.out.println("Insert operation canceled.");
					}
					break;

				case 2: // Update an existing employee
					System.out.print("Enter Employee ID to update: ");
					String updateId = scanner.nextLine();
					Employee employeeToUpdate = (Employee) staffData.get(updateId);
					if (employeeToUpdate == null) {
						System.out.println("Employee not found!");
						break;
					}

					System.out.print("Enter new First Name: ");
					String newFirstName = getValidName(scanner, 15);
					System.out.print("Enter new Last Name: ");
					String newLastName = getValidName(scanner, 15);

					System.out.print("Please ensure that information entered is correct before updating. (yes/no): ");
					if (scanner.nextLine().equalsIgnoreCase("yes")) {
						employeeToUpdate.setFirstName(newFirstName);
						employeeToUpdate.setLastName(newLastName);
						int updateCount = employeeToUpdate.update();
						if (updateCount > 0) {
							System.out.println("Employee updated successfully!");
						} else {
							System.out.println("Employee update failed.");
						}
					} else {
						System.out.println("Update operation canceled.");
					}
					break;

				case 3: // Delete an employee
					System.out.print("Enter Employee ID to delete: ");
					String deleteId = scanner.nextLine();
					Employee employeeToDelete = (Employee) staffData.get(deleteId);
					if (employeeToDelete == null) {
						System.out.println("Employee not found!");
						break;
					}

					System.out.print("Are you sure you want to delete this employee? (yes/no): ");
					if (scanner.nextLine().equalsIgnoreCase("yes")) {
						int deleteCount = employeeToDelete.deleteEmployee();
						if (deleteCount > 0) {
							staffData.remove(deleteId);
							System.out.println("Employee deleted successfully!");
						} else {
							System.out.println("Employee deletion failed.");
						}
					} else {
						System.out.println("Delete operation canceled.");
					}
					break;

				case 4: // View all employees
					viewAllEmployees();
					break;

				case 5: // View employee by ID
					System.out.print("Enter Employee ID: ");
					String viewId = scanner.nextLine();
					viewEmployeeById(viewId);
					break;

				case 6: // View employees sorted by age
					viewEmployeesSortedByAge();
					break;

				case 7: // Exit
					System.out.print("Are you sure you want to exit? (yes/no): ");
					if (scanner.nextLine().equalsIgnoreCase("yes")) {
						System.out.println("Exiting...");
						return;
					}
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("An error occurred: " + ex.getMessage());
		}
	}

	private static void loadInitialData() throws Exception {
		List<Employee> employees = EmployeeDataAccess.getAllEmployees();
		for (Employee employee : employees) {
			staffData.put(employee.getId(), employee);
		}
		System.out.println("Loaded " + staffData.size() + " employees from the database.");
	}

	private static void viewAllEmployees() {
		if (staffData.isEmpty()) {
			System.out.println("No employees found.");
		} else {
			ArrayList<Staff> sortedStaff = new ArrayList<>(staffData.values());
			Collections.sort(sortedStaff);
			for (Staff staff : sortedStaff) {
				staff.displayStaffInfo();
				System.out.println("------------------------------------------------");
			}
		}
	}

	private static void viewEmployeeById(String id) {
		Staff staff = staffData.get(id);
		if (staff == null) {
			System.out.println("Employee not found!");
		} else {
			staff.displayStaffInfo();
		}
	}

	private static void viewEmployeesSortedByAge() {
		if (staffData.isEmpty()) {
			System.out.println("No employees found.");
		} else {
			ArrayList<Employee> employees = new ArrayList<>();
			for (Staff staff : staffData.values()) {
				if (staff instanceof Employee) {
					employees.add((Employee) staff);
				}
			}
			employees.sort(Comparator.comparingInt(Employee::calculateAge));
			for (Employee employee : employees) {
				employee.displayStaffInfo();
				System.out.println("Age: " + employee.calculateAge());
				System.out.println("------------------------------------------------");
			}
		}
	}

	private static Employee createEmployee(Scanner scanner) {
		System.out.print("Enter Employee ID (max 9 characters): ");
		String id = getValidString(scanner, 9);
		System.out.print("Enter First Name (max 15 characters): ");
		String firstName = getValidName(scanner, 15);
		System.out.print("Enter Last Name (max 15 characters): ");
		String lastName = getValidName(scanner, 15);
		System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
		Date dateOfBirth = getValidDate(scanner);
		System.out.print("Enter Address (max 20 characters): ");
		String address = getValidString(scanner, 20);
		System.out.print("Enter City (max 20 characters): ");
		String city = getValidString(scanner, 20);
		System.out.print("Enter State (2 characters): ");
		String state = getValidString(scanner, 2);
		System.out.print("Enter Telephone (10 digits): ");
		String telephone = getValidPhone(scanner);
		System.out.print("Enter Email (max 40 characters): ");
		String email = getValidString(scanner, 40);

		return new Employee(id, firstName, lastName, dateOfBirth, address, city, state, telephone, email);
	}

	private static int validateMenuOption(Scanner scanner) {
		while (true) {
			try {
				int input = Integer.parseInt(scanner.nextLine().trim());
				if (input >= 1 && input <= 7) {
					return input;
				} else {
					System.out.println("Invalid choice. Please re-enter:");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid choice. Please re-enter:");
			}
		}
	}

	private static String getValidString(Scanner scanner, int maxLength) {
		String input;
		while (true) {
			input = scanner.nextLine();
			if (!input.isBlank() && input.length() <= maxLength) {
				break;
			} else {
				System.out.print("Invalid input. Please try again: ");
			}
		}
		return input;
	}

	private static String getValidName(Scanner scanner, int maxLength) {
		String name;
		while (true) {
			name = scanner.nextLine();
			if (name.matches("[a-zA-Z]+") && name.length() <= maxLength) {
				break;
			} else {
				System.out.print("Invalid name. Please enter a name with all characters and maximum length of "
						+ maxLength + ": ");
			}
		}
		return name;
	}

	private static Date getValidDate(Scanner scanner) {
		while (true) {
			String dateStr = scanner.nextLine();
			try {
				return Date.valueOf(dateStr);
			} catch (IllegalArgumentException e) {
				System.out.print("Invalid date format. Please enter the date in YYYY-MM-DD format: ");
			}
		}
	}

	private static String getValidPhone(Scanner scanner) {
		String phone;
		while (true) {
			phone = scanner.nextLine();
			if (phone.matches("\\d{10}")) {
				break;
			} else {
				System.out.print("Invalid phone number. Please enter a 10-digit number: ");
			}
		}
		return phone;
	}
}