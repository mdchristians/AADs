package hw2p1;

import java.util.Scanner;
import java.util.Vector;

public class Checkout {

	Vector register = new Vector(1, 1);

	public void getOrder() {
		// TODO Auto-generated method stub
		Checkout checkout = new Checkout();
		
		System.out.println("Choose a dessert item: \n1. Candy \n2. Cookie \n3. Ice Cream\n4. Sundae");
	    Scanner scanner = new Scanner(System.in);
	    int dessertNumber = scanner.nextInt();
	    
	    if (dessertNumber == 1){
	    	checkout.register.add("Candy");
	    	
	    	System.out.println("Choose a candy: \n1. Choco \n2. Butter \n3. Toffee\n4. Jelly");
	    	int choice = scanner.nextInt();
	    	if (choice == 1){
	    		checkout.register.add("Choco");
	    	}
	    	else if (choice == 2){
	    		checkout.register.add("Butter");
	    	}
	    	else if (choice == 3){
	    		checkout.register.add("Toffee");
	    	}
	    	else if (choice == 4){
	    		checkout.register.add("Jelly");
	    	}
	    	
	    	System.out.println("How many pounds?:");
	    	double weight = scanner.nextDouble();
	    	checkout.register.add(weight);
	    }

	    for (int i = 0; i < checkout.register.size(); i++){
	    	System.out.println(checkout.register.elementAt(i)); //just an example
	    }
	    
	    checkout.register.clear();
	    scanner.close();
	}
	
	public static void main(String[] args){
		Checkout customerCheckout = new Checkout();
		customerCheckout.getOrder();
	}

}
