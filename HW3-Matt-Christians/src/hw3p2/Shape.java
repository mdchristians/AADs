package hw3p2;

import java.util.Scanner;

public class Shape {
	
	public void calculateCircleArea()
	{
		
	   Scanner scanner = new Scanner(System.in);

	   System.out.print("Enter the radius: ");	      
	   double radius = scanner.nextDouble();
	      
	   //Area = PI*radius*radius	      
	   double area = Math.PI * (radius * radius);	      
	   System.out.println("The area of circle is: " + area);
	   
	   scanner.close();

	}
	
	public void calculateRectangleArea()
	{
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("Enter the length of Rectangle: ");
		   double length = scanner.nextDouble();
		   
		   System.out.println("Enter the width of Rectangle: ");
		   double width = scanner.nextDouble();
		   
		   //Area = length*width;
		   double area = length*width;
		   System.out.println("Area of Rectangle is: " + area);
		   
		   scanner.close();
	   }

	public void calculateVolume()
	{
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("Enter the length of Rectangle: ");
		   double length = scanner.nextDouble();
		   
		   System.out.println("Enter the width of Rectangle: ");
		   double width = scanner.nextDouble();
		   
		   System.out.println("Enter the height of Rectangle: ");
		   double height = scanner.nextDouble();
		   
		   //Area = length*width;
		   double volume = length*width*height;
		   System.out.println("Area of Rectangle is: " + volume);
		   
		   scanner.close();
	   }
	
}
