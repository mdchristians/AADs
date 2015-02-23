/*
 * Matt Christians
 * Homework 2
 * Problem 1
 */

package hw2p1;

public class DessertShop {
	
	// Declaring Constants
	public final static double TAX_RATE = 6.5;
	public final static String STORE_NAME = "UMD Dessert Shop";

	// Max Number of characters for an item
	public final static int MAX_ITEM_NAME_SIZE = 25;

	public String cents2DollarAndCents(int cents) {

		// Begin with the variable
		String str = "";

		// Add statements for proper display of cents
		if (cents < 0) {
			str += "-";
			cents *= -1;
		}
		
	    int dollars = cents/100;
	    cents = cents % 100;
	    
	    if (dollars > 0)
	      str += dollars;
	    
	    str +=".";
	      
	    if (cents < 10)
	      str += "0";
	      
	    str += cents;

		return str;
	}
}
