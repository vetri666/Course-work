public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // No-arg constructor with default side values
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor with specified side lengths
    public Triangle(double side1, double side2, double side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    // Accessor methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setter methods with validation
    public void setSide1(double side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side 1 must be positive.");
        }
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side 2 must be positive.");
        }
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side 3 must be positive.");
        }
        this.side3 = side3;
    }

    // Method to calculate the area using Heron's formula
    public double getArea() {
        double s = getPerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString method
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
