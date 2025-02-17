public class InputValidator {

    public static boolean isValidDirectoryOption(int option) {
        return option >= 1 && option <= 5;
    }

    public static boolean isValidId(String id) {
        return id.length() <= 8 && !id.isEmpty();
    }

    public static boolean isValidName(String name) {
        return name.length() <= 14 && !name.isEmpty() && name.matches("[a-zA-Z]+");
    }

    public static boolean isValidDateOfBirth(String dob) {
        try {
            String[] parts = dob.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);
            if (year <= 2024 && month <= 12 && day <= 31) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean isValidAddress(String address) {
        return address.length() <= 19 && !address.isEmpty();
    }

    public static boolean isValidCity(String city) {
        return city.length() <= 19 && !city.isEmpty();
    }

    public static boolean isValidState(String state) {
        return state.length() == 2 && !state.isEmpty() && state.matches("[a-zA-Z]+");
    }

    public static boolean isValidPhone(String phone) {
        return phone.length() <= 9 && phone.matches("[0-9]+");
    }

    public static boolean isValidEmail(String email) {
        return email.length() <= 39 && !email.isEmpty();
    }
}
