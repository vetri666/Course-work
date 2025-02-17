package Project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BabyNamePopularityRanking {

    public static void main(String[] args) {
        // Create a new instance of BabyNamesRankings to load the data
        BabyNamesRankings rankings = new BabyNamesRankings();

        // Set up the scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // 1. Prompt and validate year input
        int year = 0;
        while (true) {
            System.out.print("Enter the year (2001-2010): ");
            try {
                year = input.nextInt(); // Attempt to read an integer
                if (year >= 2001 && year <= 2010) {
                    break; // Valid year, exit loop
                } else {
                    System.out.println("Invalid year input. Please enter a year between 2001 and 2010.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please enter a numeric year (2001-2010).");
                input.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }

        // 2. Prompt and validate gender input
        char gender = ' ';
        while (true) {
            System.out.print("Enter the gender (M/F): ");
            try {
                gender = Character.toUpperCase(input.next().charAt(0));
                if (gender == 'M' || gender == 'F') {
                    break; // Valid gender, exit loop
                } else {
                    System.out.println("Invalid gender input. Please enter 'M' or 'F'.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input type. Please enter 'M' or 'F'.");
                input.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }
        
        // 3. Prompt for name and standardize name format
        System.out.print("Enter the name: ");
        String name = input.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        // Call the method to get the ranking
        int rank;
        if (gender == 'M') {
            rank = rankings.getBoyNameRank(year, name);
        } else {
            rank = rankings.getGirlNameRank(year, name);
        }

        // Display the result based on the ranking found
        if (rank != -1) {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        } else {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }
}
