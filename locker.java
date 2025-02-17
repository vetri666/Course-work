import java.util.Scanner;

public class locker {
    public static void main(String[] args) {
    	
    Scanner input = new Scanner (System.in);
    		
    	System.out.println("enter the radius:");
    	
    double radius=input.nextDouble();
    
    double area;
    
     area = radius * radius * 3.14;
    
    System.out.println("the radius of  the circle is :" + area);
    
    }
}


