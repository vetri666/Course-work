package Test;

import java.lang.classfile.instruction.NewObjectInstruction;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

//switch 
		/*
		 * System.out.println("enter the case:"); String text = input.nextLine();
		 * 
		 * switch (text) { case "start": System.out.println("started"); break;
		 * 
		 * case "stop": System.out.println("stopped"); break;
		 * 
		 * default: System.out.println("invalid "); }
		 */
		
		// arrays

		int value = 9;

		
		int[] values = {3,5,456};
		
System.out.println(values[2]);

int[][] grid = {
		{3,5,456},
		{4,5},
		{1,2,3,4}

};

System.out.println(grid[1][1]);
System.out.println(grid[0][2]);

String[][] texts = new String[2][3];

System.out.println(texts[0][1]);

texts[0][1]="hello there";
System.out.println(texts[0][1]);

for (int row=0; row<grid.length; row++) {
	for (int col=0;col<grid[row].length; col++) {
	System.out.print(grid[row][col]+"\t");
}
	
		
/*	
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
*/
		values[0]=10;
		values[1]=20;
		values[2]=30;
		values[3]=40;

	/*	System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
*/
		
	//	System.out.println(values[1]);
/*
		for (int i = 0; i<values.length;i++) {
			System.out.println(values[i]);
		}
*/
		
		int[] numbers= {5,6,7,8};
		for (int i =0; i<numbers.length;i++) {
		System.out.println(numbers[i]);
		}
		
		String[] fruits = {"apple","banana",};
				for (String fruit:fruits) {
			System.out.println(fruit);
		}
		
}}}
