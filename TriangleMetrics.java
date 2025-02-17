import java.util.Scanner;

public class TriangleMetrics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Prompt user to enter three sides of the triangle
            System.out.print("Enter side 1 of the triangle: ");
            double side1 = input.nextDouble();
            System.out.print("Enter side 2 of the triangle: ");
            double side2 = input.nextDouble();
            System.out.print("Enter side 3 of the triangle: ");
            double side3 = input.nextDouble();

            // Prompt user for color and filled status
            System.out.print("Enter the color of the triangle: ");
            String color = input.next();
            System.out.print("Is the triangle filled (true/false): ");
            boolean filled = input.nextBoolean();

            // Create a Triangle object with user input and handle invalid sides
            Triangle triangle = new Triangle();
            triangle.setSide1(side1);
            triangle.setSide2(side2);
            triangle.setSide3(side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            // Display the triangle's area, perimeter, color, and filled status
            System.out.println("The area of the triangle is: " + triangle.getArea());
            System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Is filled: " + triangle.isFilled());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
