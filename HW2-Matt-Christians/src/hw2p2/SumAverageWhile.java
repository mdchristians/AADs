/*
 * Matt Christians
 * Homework 2
 * Problem 2
 */

package hw2p2;

class SumAverageWhile extends SumAverage
{
    @Override
    public void addAndAverage()
    {
    	// Start
    	double result = 0;
	    int number = 2;
	    double count = 0;
	    double average=0;
	    while (count <= 20)
	    {
	    	// Is the number prime?
	        if (checkPrime(number)==true)
	        {
	        	result += 1.0 / number;                       
	        }               
	        
	        count++; //The count variable here has been moved to outside the loop.
	        number++;
	    } 
	    
	    // Calculate the average
	    average = (double) result / count;
	    
	    System.out.println("The SumAverageWhile sum is "+ result);
	    System.out.println("The SumAverageWhile avg is "+ average);
	    System.out.println("");
	}

    // PRIME CHECKER!!!
	public static boolean checkPrime(int number) {
	    for (int i = 2; i < number; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }       
	    return true;
	}
}
