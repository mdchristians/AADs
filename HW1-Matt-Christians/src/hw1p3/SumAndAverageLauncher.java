/*
 * Matt Christians
 * Homework 1
 * Problem 3
 */

package hw1p3;

import hw1p3.SumAndAverageForLoop;
import hw1p3.SumAndAverageWhileLoop;
import hw1p3.SumAndAverageOdd;
import hw1p3.SumAndAverageSeven;

public class SumAndAverageLauncher 
{

	public static void main(String[] args) 
	{
		// generate For Loop
		SumAndAverageForLoop fLoop = new SumAndAverageForLoop();
		fLoop.forLoop();

		// Generate While Loop
		SumAndAverageWhileLoop wLoop = new SumAndAverageWhileLoop();
		wLoop.whileLoop();

		// Generate Odd Loop
		SumAndAverageOdd odd = new SumAndAverageOdd();
		odd.oddLoop();

		// Generate Seven Loop
		SumAndAverageSeven seven = new SumAndAverageSeven();
		seven.sevenLoop();

	} // end main

} // end SumAndAverageLauncher
