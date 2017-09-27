package lab2;

import java.util.*;

/**
 * 
 * @author fugit
 *
 */

public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuffer inputString = new StringBuffer(sc.nextLine());
		sc.close();
		inputString.append(" bye");
		System.out.println("Original String: "+inputString);
		
		for( int i = 0; i < inputString.length(); ++i) {
			if(Character.isLowerCase(inputString.charAt(i))) {
				inputString.setCharAt(i, Character.toUpperCase(inputString.charAt(i)));
			}
			else {
				inputString.setCharAt(i, Character.toLowerCase(inputString.charAt(i)));
			}
		}
		System.out.print("Formatted String: "+inputString);
	}
}
