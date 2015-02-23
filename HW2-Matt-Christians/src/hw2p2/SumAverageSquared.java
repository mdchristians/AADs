/*
 * Matt Christians
 * Homework 2
 * Problem 2
 */

package hw2p2;

class SumAverageSquared extends SumAverage
{
    @Override
	public void addAndAverage()
    {
    	// START YOUR ENGINES
	    double result = 0;
	    int number = 2;
	    double count = 0;
	    double average=0;
	    while (count <= 20)
	    {
	    	// Is it prime, though?
	        if(checkPrime(number)==true)
	        {
	        	// Create temp for square
	        	int temp = number*number;
	        	result += 1.0 / temp;                       
	        }  
	        
	        count++; //The count variable here has been moved to outside the loop.
	        number++;
	    }    
	    
	    // Calculate the average
	    average = (double) result / count;
	    
	    System.out.println("The SumAverageSquared sum is "+ result);
	    System.out.println("The SumAverageSquared avg is "+ average);
	    System.out.println("");
	}
    
    // Is it prime?
	public static boolean checkPrime(int number)
	{
	    for (int i = 2; i < number; i++)
	    {
	        if (number % i == 0)
	        {
	            return false;
	        }
	    }       
	    return true;
	}
}
