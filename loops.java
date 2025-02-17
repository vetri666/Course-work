import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input-water quantity in kilograms
        System.out.print("Please enter the amount of water in kilograms: ");
        float waterAmount = input.nextFloat();

        // Checking if input amount is negative and throwing error
        while (waterAmount < 0) {
            System.out.println("Sorry! The water amount cannot be a negative number! Enter a valid value: ");
            waterAmount = input.nextFloat();  // Correctly update waterAmount with new input
        }

        // User input for the initial temp
        System.out.print("Enter the initial temperature of water in Celsius: ");
        float initialTemp = input.nextFloat();

        // User input for the final temp
        System.out.print("Enter the final temperature of water in Celsius: ");
        float finalTemp = input.nextFloat();

        // Formula for energy calculation
        float energy = waterAmount * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is " + energy + " joules.");
    }
}
