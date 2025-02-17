import java.util.Scanner;

public class Calculatetheenergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input-water quantity in kilograms
        System.out.print("Please enter the amount of water in kilograms: ");
        float waterAmount = input.nextFloat();

        // Checking if input amount is negative and throwing error
        if (waterAmount < 0) {
            System.out.println("Sorry! The water amount cannot be a negative number!");
            
            return; 
            //Closing program with the above error message
            
   
        }

        // User input for the initial temp
        System.out.print("Enter the initial temperature of water in Celsius: ");
        Float initialTemp = input.nextFloat();

        // User input for the final temp
        System.out.print("Enter the final temperature of water in Celsius: ");
        float finalTemp = input.nextFloat();

        // Formula of energy 
        Float energy = waterAmount * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is " + energy + " joules.");
        
        
    }
}
