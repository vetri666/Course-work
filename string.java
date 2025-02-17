import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a lowercase letter
        System.out.print("Enter a lowercase letter: ");
        String letter = input.next(); // Accept input as a String

        // Ensure input is a single character and a lowercase letter
        if (letter.length() == 1 && Character.isLowerCase(letter.charAt(0))) {
        	
            int number = getCorrespondingNumber(letter.charAt(0));
            System.out.println("The corresponding number is: " + number);
        } else {
            // Display invalid input for non-lowercase letters or non-letter input
            System.out.println("Invalid input");
        }
    }

    // Method to return corresponding number on the dial pad of the phone keypad 
    //using switch-case
    
    public static int getCorrespondingNumber(char letter) {
        switch (letter) {
            case 'a': case 'b': case 'c':
                return 2;
            case 'd': case 'e': case 'f':
                return 3;
            case 'g': case 'h': case 'i':
                return 4;
            case 'j': case 'k': case 'l':
                return 5;
            case 'm': case 'n': case 'o':
                return 6;
            case 'p': case 'q': case 'r': case 's':
                return 7;
            case 't': case 'u': case 'v':
                return 8;
            case 'w': case 'x': case 'y': case 'z':
                return 9;
            default:
                return -1;
        }
    }
}
