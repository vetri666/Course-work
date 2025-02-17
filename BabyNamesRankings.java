package Project1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BabyNamesRankings {

    // 2D arrays to store rankings of boy and girl names for 10 years
    private String[][] boyNames = new String[10][1000]; 
    private String[][] girlNames = new String[10][1000]; 

    // Method to loads names from files
    public BabyNamesRankings() {
        for (int year = 2001; year <= 2010; year++) {
            loadNamesFromFile(year);
        }
    }

    // Call method to load the names from a file for the current year
    private void loadNamesFromFile(int year) {
    	File file = new File("src\\Data\\babynameranking" + year + ".txt");

        try (Scanner fileScanner = new Scanner(file)) {
            int rankIndex = 0;
            while (fileScanner.hasNextLine() && rankIndex < 1000) {
                String[] line = fileScanner.nextLine().split("\\s+");
                // Store boy's and girl's names in the arrays
                boyNames[year - 2001][rankIndex] = line[1]; 
                girlNames[year - 2001][rankIndex] = line[3]; 
                rankIndex++;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // Method to get the ranking of a boy's name
    public int getBoyNameRank(int year, String name) {
        int yearIndex = year - 2001;
        for (int rank = 0; rank < 1000; rank++) {
            if (boyNames[yearIndex][rank].equals(name)) {
                return rank + 1; 
            }
        }
        return -1; // Name not found
    }

    // Method to get the ranking of a girl's name
    public int getGirlNameRank(int year, String name) {
        int yearIndex = year - 2001;
        for (int rank = 0; rank < 1000; rank++) {
            if (girlNames[yearIndex][rank].equals(name)) {
                return rank + 1; 
            }
        }
        return -1; 
    }
}
