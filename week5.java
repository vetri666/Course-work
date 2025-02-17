import java.util.Scanner;

public class week5 {

    // Own method to calculate the sum of digits
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number > 0) {
            int lastDigit = number % 10; 
            // Get the last digit
            
            sum += lastDigit;             
            // Add the last digit to sum
            
            number = number / 10;         
            // Remove the last digit
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the custom method and store the sum result
        int sum = calculateSumOfDigits(number);
        
        // Output the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
