/*
 * Matt Christians
 * Homework 1
 * Problem 3
 */

package hw1p3;

public class SumAndAverageWhileLoop
{
	public void whileLoop()
	{
		int sum = 0;
		int i = 1;
		while (i <= 100) {
		    sum += i;
		    i++;
		}
		
		int avg = sum / 100;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
	} // end Loop
	
} // end Loop
