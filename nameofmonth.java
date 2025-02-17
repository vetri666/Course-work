import java.util.Scanner;  // Import Scanner for input

public class nameofmonth {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number between 1 and 12
        System.out.println("Please enter a number between 1 and 12:");

        // Read the input number
        int monthNumber = scanner.nextInt();

        // Determine the month based on the input number
        if (monthNumber == 1) {
            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");
        } else if (monthNumber == 3) {
            System.out.println("March");
        } else if (monthNumber == 4) {
            System.out.println("April");
        } else if (monthNumber == 5) {
            System.out.println("May");
        } else if (monthNumber == 6) {
            System.out.println("June");
        } else if (monthNumber == 7) {
            System.out.println("July");
        } else if (monthNumber == 8) {
            System.out.println("August");
        } else if (monthNumber == 9) {
            System.out.println("September");
        } else if (monthNumber == 10) {
            System.out.println("October");
        } else if (monthNumber == 11) {
            System.out.println("November");
        } else if (monthNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("That is an Invalid input! Please enter a number between 1 and 12.");
        }

    } 
}
