/*
 * Matt Christians
 * Homework 1
 * Problem 1
 */

package hw1p1;

// begin BeerSong
public class BeerSong 
{
	
	// Begin main
	public static void main(String[] args) 
	{

		// reading to drink?
		int beerNum = 99;
		String word = "bottles";
		
		while(beerNum > 0) 
		{	
		
			//Let the printing begin
			System.out.println(beerNum + " " + word + " of beer on the wall,");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down,");
			System.out.println("Pass it around,");
		
			beerNum = beerNum - 1;
		
			if (beerNum == 1) 
			{
				word = "bottle";
			}
		
			else if (beerNum > 0) 
			{
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			}
		
			else if (beerNum == 0) 
			{
				System.out.println("No more bottles of beer on the wall.");
			}
		} // finish while
		
	} // end Main
	
} // end BeerSong...  for now


