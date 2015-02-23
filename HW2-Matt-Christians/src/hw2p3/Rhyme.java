/*
 * Matt Christians
 * Homework 2
 * Problem 3
 */

package hw2p3;

public class Rhyme {
	
	// Initiate
	public void eenyMinyMoe(int [] foo)
	{
		 
		// Start Array
		 for(int i = 1; i <= (foo.length - 1); i++)
		 {
			 foo[i-1] = i;
		 }
		 
		 // Begin picking out our 3's 5's 7's and combos
		 for (int i = 0; i <= (foo.length - 1); i++)
		 {
			 
			 if ((foo[i] % 3 != 0 ) && (foo[i] % 5 != 0) && (foo[i] % 7 != 0))
			 {
				 System.out.print(foo[i] + " "); 
		 	 }
			 
			 else if (foo[i] % 3 == 0)
			 {
				 System.out.print("Eeny" + " ");
			 }
			 
			 else if (foo[i] % 5 == 0)
			 {
				 System.out.print("Miny" + " ");
			 }
			 
			 else if (foo[i] % 7 == 0)
			 {
			 	System.out.print("Moe" + " ");
			 }
			 
			 else if ((foo[i] % 3 == 0) && (foo[i] % 5 == 0))
			 {
				 System.out.print("EenyMiny" + " ");
			 }
			 
			 else if ((foo[i] % 5 == 0) && (foo[i] % 7 == 0)) 
			 {
				 System.out.print("EenyMoe" + " ");
			 }
			 
			 else if ((foo[i] % 3 == 0) && (foo[i] % 7 == 0)) 
			 {
				 System.out.print("MinyMoe" + " ");
			 }
			 
			 // If our number is divisible by 11, blank line it
			 if (foo[i] % 11 == 0) 
			 {
				 System.out.println();
				 System.out.println();
			 }
			 
		 }
		 
		 System.out.println("");
		 System.out.println("");
		 
	 }
	
}
