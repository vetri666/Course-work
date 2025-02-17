import java.util.Scanner;

public class week4class2 {
    public static void main(String[] args) {
        // scanning object to get the input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for inout
        System.out.print("Enter the number of lines (1 to 15): ");
        int numLines = scanner.nextInt();

        // Ensuring user if input is with range
        if (numLines >= 1 && numLines <= 15) {
        	
            // Outer loop for prog 
            for (int i = 1; i <= numLines; i++) {
            	
                // Print leading spaces to center the pyramid
                for (int j = 1; j <= (numLines - i) * 3; j++) {
                    System.out.print(" ");
                }

                // Print decreasing numbers from i to 1
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                // Print increasing numbers from 2 to i
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }

                // Move to the next line after each row
                System.out.println();
            }
        } else {
            System.out.println("Please enter a number between 1 and 15.");
        }

        // Close the scanner
        scanner.close();
    }
}
