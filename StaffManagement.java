import java.sql.*;
import java.util.*;

public class StaffManagement {

    // Method to prompt the user until valid input is received
    private static int getValidDirectoryOption() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.print("Enter a directory option (1-5): ");
            option = sc.nextInt();
            if (!InputValidator.isValidDirectoryOption(option)) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        } while (!InputValidator.isValidDirectoryOption(option));
        return option;
    }

    private static String getValidId() {
        Scanner sc = new Scanner(System.in);
        String id;
        do {
            System.out.print("Enter staff ID (max 8 characters): ");
            id = sc.nextLine();
            if (!InputValidator.isValidId(id)) {
                System.out.println("Invalid input. ID must be less than 9 characters and not empty.");
            }
        } while (!InputValidator.isValidId(id));
        return id;
    }

    private static String getValidName(String prompt) {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.print(prompt);
            name = sc.nextLine();
            if (!InputValidator.isValidName(name)) {
                System.out.println("Invalid input. Name must be less than 15 characters and only contain letters.");
            }
        } while (!InputValidator.isValidName(name));
        return name;
    }

    private static Date getValidDateOfBirth() {
        Scanner sc = new Scanner(System.in);
        String dob;
        Date date = null;
        do {
            System.out.print("Enter birth date (YYYY-MM-DD): ");
            dob = sc.nextLine();
            if (InputValidator.isValidDateOfBirth(dob)) {
                try {
                    date = Date.valueOf(dob);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input. Please enter a valid date in the format YYYY-MM-DD.");
                }
            } else {
                System.out.println("Invalid input. Birth date must be before or on 2024 and in the correct format.");
            }
        } while (date == null);
        return date;
    }

    private static String getValidAddress() {
        Scanner sc = new Scanner(System.in);
        String address;
        do {
            System.out.print("Enter address (max 20 characters): ");
            address = sc.nextLine();
            if (!InputValidator.isValidAddress(address)) {
                System.out.println("Invalid input. Address must be less than 20 characters and not empty.");
            }
        } while (!InputValidator.isValidAddress(address));
        return address;
    }

    private static String getValidCity() {
        Scanner sc = new Scanner(System.in);
        String city;
        do {
            System.out.print("Enter city (max 20 characters): ");
            city = sc.nextLine();
            if (!InputValidator.isValidCity(city)) {
                System.out.println("Invalid input. City must be less than 20 characters and not empty.");
            }
        } while (!InputValidator.isValidCity(city));
        return city;
    }

    private static String getValidState() {
        Scanner sc = new Scanner(System.in);
        String state;
        do {
            System.out.print("Enter state (2 characters): ");
            state = sc.nextLine();
            if (!InputValidator.isValidState(state)) {
                System.out.println("Invalid input. State must be exactly 2 characters and only contain letters.");
            }
        } while (!InputValidator.isValidState(state));
        return state;
    }

    private static String getValidPhone() {
        Scanner sc = new Scanner(System.in);
        String phone;
        do {
            System.out.print("Enter phone number (max 10 digits): ");
            phone = sc.nextLine();
            if (!InputValidator.isValidPhone(phone)) {
                System.out.println("Invalid input. Phone number must be 10 digits and only contain numbers.");
            }
        } while (!InputValidator.isValidPhone(phone));
        return phone;
    }

    private static String getValidEmail() {
        Scanner sc = new Scanner(System.in);
        String email;
        do {
            System.out.print("Enter email (max 40 characters): ");
            email = sc.nextLine();
            if (!InputValidator.isValidEmail(email)) {
                System.out.println("Invalid input. Email must be less than 40 characters and not empty.");
            }
        } while (!InputValidator.isValidEmail(email));
        return email;
    }

    // Main method to demonstrate the implementation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Staff> staffList = new ArrayList<>();
        
        // Example: Collect staff information
        int directoryOption = getValidDirectoryOption();
        String id = getValidId();
        String lastName = getValidName("Enter last name: ");
        String firstName = getValidName("Enter first name: ");
        Date dob = getValidDateOfBirth();
        String address = getValidAddress();
        String city = getValidCity();
        String state = getValidState();
        String phone = getValidPhone();
        String email = getValidEmail();

        // Create and add the staff member to the list
        Staff newStaff = new Staff(id, lastName, firstName, dob, address, city, state, phone, email);
        staffList.add(newStaff);

        // Sort staff by age (ascending order)
        Collections.sort(staffList);

        // Print staff details (example output)
        for (Staff staff : staffList) {
            System.out.println("ID: " + staff.id + ", Name: " + staff.firstName + " " + staff.lastName);
        }
    }

	private static Date getValidDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Date getValidDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
