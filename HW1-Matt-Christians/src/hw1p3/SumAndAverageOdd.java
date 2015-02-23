/*
 * Matt Christians
 * Homework 1
 * Problem 3
 */

package hw1p3;

public class SumAndAverageOdd 
{
	public void oddLoop()
	{
		int sum = 0;
		for (int i = 1; i <= 100; i+=2) 
		{
			sum += i; 
		}
	
		int avg = sum / 100;
	
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
	} // end Loop
	
} // end Loop
