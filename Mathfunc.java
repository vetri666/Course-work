import java.util.Scanner;

public class Mathfunc {
    
	public static void main(String[] args) {
   Scanner input = new Scanner9system.in);
   
   System.out.print("Enter the 3 points");
   double x1 = input.nextDouble();
   double y1 = input.nextDouble();
   double x2 = input.nextDouble();
   double y2 = input.nextDouble();
   double x3 = input.nextDouble();
   double y3 = input.nextDouble();
   
   
   
   //compute 3 slides
   double a = Math.sqrt(Math.pow((x2-x3, y3),2) + (y2-y3) * (y2-y3));
   double b = Math.sqrt(Math.pow((x2-x3, y3),2) + (y2-y3) * (y2-y3));
   double c = Math.sqrt(Math.pow((x2-x3, y3),2) + (y2-y3) * (y2-y3));
   
   
   
   
   
   ---------------------
   
   import java.util.Scanner;

   public class Mathfunc{
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

           // Prompt user for the side length
           System.out.print("Enter the value of S (side length): ");
           double S = input.nextDouble();

           // Calculate the result using the formula (6 * S^2) / (4 * tan(π/6))
           double result = (6 * Math.pow(S, 2)) / (4 * Math.tan(Math.PI / 6));

           // Display the result
           System.out.println("The result of the formula is: " + result);
       }
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
