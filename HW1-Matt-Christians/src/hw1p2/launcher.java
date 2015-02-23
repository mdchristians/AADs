/*
 * Matt Christians
 * Homework 1
 * Problem 2
 */

package hw1p2;

// Houston get ready for launch
public class launcher 
{

	// start your engines!!
	public static void main(String[] args) 
	{
		
		// initiate MegaNumbers
		MegaNumbers megaNum = new MegaNumbers();
		megaNum.generateMegaNumbers(1, 51);
		
		// initiate MegaBall
		MegaBall ballNum = new MegaBall();
		ballNum.generateMegaBall(1, 31);
		
		megaNum.generateNumbers();
		
		ballNum.generateBallNumbers();
		
	} // end main

} // end launcher
