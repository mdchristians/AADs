/*
 * Matt Christians
 * Homework 1
 * Problem 2
 */

package hw1p2;

import java.util.ArrayList;
import java.util.Collections;

// begin MegaNumbers
public class MegaNumbers 
{
	
	// begin generateMegaNumbers
	public void generateMegaNumbers(int min, int max) 
	{
		int interval = max - min; 
		
		if (interval < 50) 
		{
			System.out.println("The numbers must meet the requirements!");
		}
		
	} // generateMegaNumbers
	
	// begin generateNumbers
	public void generateNumbers() 
	{
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++)     
		{     
			numbers.add(i+1);
		}

		Collections.shuffle(numbers);
		System.out.print("The Mega Numbers are: ");

		for(int j = 0; j < 5; j++)     
		{       
			System.out.print(numbers.get(j) + " ");
		}
		
		
	} // generateNumbers
	
} // MegaNumber

