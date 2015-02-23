/*
 * Matt Christians
 * Homework 2
 * Problem 2
 */

package hw2p2;

public class SumAverage {
	public void addAndAverage()
	{
		// Start
		double result = 0;
		double count = 0;
		double average=0;
		int number = 2;
		for (int i = 1; i <= 20; i++)
		{
			// Take the prime number and add it
			if(checkPrime(number)==true)
			{
				result += 1.0 / number;                       
			}  
			
			number++;
	        count++;
	    }       
	    
		// Calculate the average
		average = (double) result / count;
	    
		System.out.println("The Sum is "+ result);
	    System.out.println("The Average is "+ average);
	    System.out.println("");
	}

	// Is the number prime or not?
	public static boolean checkPrime(int number)
	{
		
		for (int j = 2; j < number; j++)
		{
			
			if (number % j == 0)
			{
				return false;
			}
		}       
		
		return true;
	}
}