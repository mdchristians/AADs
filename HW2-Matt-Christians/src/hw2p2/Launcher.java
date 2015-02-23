/*
 * Matt Christians
 * Homework 2
 * Problem 2
 */

package hw2p2;

public class Launcher {

	public static void main(String[] args)
	{
	    System.out.println("SumAverage:");
	    new SumAverage().addAndAverage();
	    System.out.println("SumAverageWhile:");
	    new SumAverageWhile().addAndAverage();
	    System.out.println("SumAverageSquared:");
	    new SumAverageSquared().addAndAverage();
	}

}
