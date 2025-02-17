import java.util.Scanner;

public class Threecities {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three city names
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String first, second, third;

        // Compare the cities and determine the order
        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
            first = city1;
            if (city2.compareTo(city3) < 0) {
                second = city2;
                third = city3;
            } else {
                second = city3;
                third = city2;
            }
        } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
            first = city2;
            if (city1.compareTo(city3) < 0) {
                second = city1;
                third = city3;
            } else {
                second = city3;
                third = city1;
            }
        } else {
            first = city3;
            if (city1.compareTo(city2) < 0) {
                second = city1;
                third = city2;
            } else {
                second = city2;
                third = city1;
            }
        }

        // Display the cities in alphabetical order
        System.out.println("The three cities in alphabetical order are: " + 
                           first + " " + second + " " + third);
    }
}
