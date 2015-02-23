/*
 * Matt Christians
 * Homework 1
 * Problem 2
 */

package hw1p2;

// begin MegaBall
public class MegaBall 
{
	
	// begin generateMegaBall
	public void generateMegaBall(int min, int max) 
	{
		int interval = max - min;
		if (interval < 30) 
		{
			System.out.println("The numbers must meet the requirements!");
		}
	} // end generateMegaBall
	
	// begin generateBallNumbers
	public void generateBallNumbers() 
	{
		int min = 1;
		int max = 31;
		int interval = max - min;
		
		int lotBall = (int) (Math.random() * interval);
		
		int [] ballNumbers = {lotBall};
		
		System.out.println(" ");
		System.out.print("The Mega Ball is: ");
		System.out.println(ballNumbers[0]);
		
		} //end generateBallNumbers

} // end MegaBall
