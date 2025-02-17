import java.util.Scanner;

public class week6class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Reading a 4x4 matrix from the user
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Calculate the sum of diagonal elements
        double sum = sumOfMatrixDiagonal(matrix);

        // Display the result
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }

    // Method to calculate the sum of the diagonal elements of a matrix
    public static double sumOfMatrixDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i]; // Accessing major diagonal elements
        }
        return sum;
    }
}
