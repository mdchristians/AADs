package hw3p1;

import java.util.Scanner;

public class FirstStringMatch {
	
	public void matchString() {
		
		String inputString = "*1*Bowl*2*Bowl*3*Bowl*Many*Bowls*Of*Fun";
		
		Scanner s = new Scanner(inputString).useDelimiter("\\s*bowl\\s*");
		System.out.println(s.nextInt());
	    System.out.println(s.nextInt());
	    System.out.println(s.nextInt());
	    System.out.println(s.next());
		
		s.close();
}

}