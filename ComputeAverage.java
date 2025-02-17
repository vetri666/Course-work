import java.util.Scanner; //Scanner is in the java.utilpackacge

public class ComputeAverage {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		
		// Prompt the user to enter the three number
		System.out.print("Enter three number");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
				
		
		// Compute the average
		double average = (number1 + number2 + number3) / 3;
		
		//Display Results
		System.out.println("The Average of " + number1 + "" + number2 + "" + number3 + "is" + average);
	}

		

	}
