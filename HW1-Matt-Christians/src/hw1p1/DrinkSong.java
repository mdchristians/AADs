/*
 * Matt Christians
 * Homework 1
 * Problem 1
 */

package hw1p1;

// start your engines
public class DrinkSong 
{
	// ready to chug?  start singDrink
	public void singDrink()
	{	
		
		// Begin loop to filter situations
		String drinkName = "PUNCH";
		int i = 6;
		for(i = 6; i > 0; i--)
		{
			String word = "bottles";
			String singWord = "bottle";
			int drinkNum = i;
			
			if(i == 6 )
			{
				drinkName = "PUNCH";
				System.out.println(drinkNum + " " + word + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
			}
			
			else if(i == 5 )
			{
				drinkName = "PUNCH";
				System.out.println(drinkNum + " " + word + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
				System.out.println("No more " + word + " of " + drinkName + " in the fridge!");
			}
			
			else if(i == 4 )
			{
				drinkName = "WATER";
				System.out.println(drinkNum + " " + word + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
			}
			
			else if(i == 3 )
			{
				drinkName = "WATER";
				System.out.println(drinkNum + " " + word + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
				System.out.println("No more " + word + " of " + drinkName + " in the fridge!");
			}
			
			else if(i == 2 )
			{
				drinkName = "JUICE";
				System.out.println(drinkNum + " " + word + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
			}
			
			else if(i == 1 )
			{
				drinkName = "JUICE";
				System.out.println(drinkNum + " " + singWord + " of " + drinkName + " in the fridge.");
				System.out.println("Take one down and pass it around.");
				System.out.println("No more " + word + " of " + drinkName + " in the fridge!");
			}
			
		} // end our for loop
		
	} // end singDrink
	
} // end DrinkSong

