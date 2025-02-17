// Define the Rectangle class
public class Rectangle {

    // Two double data fields named width and height
    private double width;
    private double height;

    // 1. Default constructor with default values (width = 1, height = 1)
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // 2. Constructor that creates a rectangle with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 3. Method to calculate the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // 4. Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Create a default rectangle
        Rectangle defaultRect = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Area: " + defaultRect.getArea());
        System.out.println("Perimeter: " + defaultRect.getPerimeter());

        // Create a rectangle with specified dimensions
        Rectangle customRect = new Rectangle(4.5, 7.8);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Area: " + customRect.getArea());
        System.out.println("Perimeter: " + customRect.getPerimeter());
    }
}
