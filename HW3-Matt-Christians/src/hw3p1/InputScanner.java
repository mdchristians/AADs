package hw3p1;

import java.util.Scanner;

public class InputScanner {

	public static String phrase;
	
	public void constructPhrase() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word:");
		String word1 = scan.next();
		System.out.println("You have entered: " + word1);

		System.out.print("Enter a word:");
		String word2 = scan.next();
		System.out.println("You have entered: " + word2);

		System.out.print("Enter a word:");
		String word3 = scan.next();
		System.out.println("You have entered: " + word3);

		System.out.print("Enter a word:");
		String word4 = scan.next();
		System.out.println("You have entered: " + word4);

		System.out.print("Enter a word:");
		String word5 = scan.next();
		System.out.println("You have entered: " + word5);

		phrase = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
		
		System.out.println(phrase);
		
		scan.close();
			
		// Non-Static Method
		FirstStringMatch obj = new FirstStringMatch();
		obj.matchString();
			
		// Static Method
		SecondStringMatch.matchString();
		
	}
	
}
