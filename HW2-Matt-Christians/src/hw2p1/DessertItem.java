/*
 * Matt Christians
 * Homework 2
 * Problem 1
 */

package hw2p1;

public class DessertItem {
	protected String name;

	/**
	* Default constructor for DessertItem class
	* The keyword "this" represents an instance of this class.
	*/

	public DessertItem() {
		this("");
	}

	/**
	* Instance constructor
	* Initializes DessertItem data
	*/

	public DessertItem(String name) {
		if(name.length() <= DessertShop.MAX_ITEM_NAME_SIZE) {
			this.name = name;
		}

		else {
			this.name = name.substring(0, DessertShop.MAX_ITEM_NAME_SIZE);
		}
	}

	/**
	* Returns name of DessertItem
	* final means this method cannot be overridden
	*/

	public String getName() {
		return name;
	}

	/**
	* Returns cost of Dessert Item
	*/

	public int getCost() {
		return 0;
	}
}
