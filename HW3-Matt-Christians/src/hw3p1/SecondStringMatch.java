package hw3p1;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class SecondStringMatch {
	
	public static String matchString() {
		
		String inputString = "*1*Bowl*2*Bowl*3*Bowl*Many*Bowls*Of*Fun";
		
		Scanner scanner = new Scanner(inputString);
	    scanner.findInLine("(\\d+) bowl (\\d+) bowl (\\w+) bowl (\\w+)");
	    MatchResult result = scanner.match();
	    for (int i=1; i<=result.groupCount(); i++)
	      System.out.println(result.group(i));
	    scanner.close();
		
		
		scanner.close();
		
		return inputString;
}
	
}
