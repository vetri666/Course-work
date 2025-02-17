import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // user to input a number between 1 and 7
        System.out.println("Enter a number (1-7) to check if it's a weekday or weekend:");

        // Read the input number
        int dayNumber = input.nextInt();

        // To Determine if the day is a weekday or weekend using a switch 
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a weekday.");
                break;
            case 6:
            case 7:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

    }
}