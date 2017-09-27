package lab2;

import java.util.*;
/**
 * Write an application that determines if an input word is a palindrome.  A palindrome is a string 
               that reads the same forward and backward, for example, noon  and  madam.  
               Ignore the case of the letter.   (Definitely do for the midterm.)
 * @author fugit
 *
 */
public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check if it's a palindrome: ");
		StringBuffer inputString = new StringBuffer(sc.nextLine().toLowerCase());
		inputString = stripAlphabet(inputString);
		int length = inputString.length();
		sc.close();
		boolean isPallindrome = true;
		for(int i = 0, j = length-1; i < length; ++i, --j) {
			if( inputString.charAt(i) != inputString.charAt(j)) {	
				isPallindrome = false;
				break;
			}
		}
		String statement = isPallindrome ? inputString + " is a pallindrome" : inputString + " is not a pallindrome";
		System.out.println(statement);
	}
	
	public static StringBuffer stripAlphabet(StringBuffer sBuffer) {
		for(int i = 0; i < sBuffer.length(); i++) {
			if( !Character.isAlphabetic(sBuffer.charAt(i)) ) {
				sBuffer.deleteCharAt(i);
			}
		}
		for(int i = 0; i < sBuffer.length(); i++) {
			if( Character.isWhitespace(sBuffer.charAt(i)) ) {
				sBuffer.deleteCharAt(i);
			}
		}
		System.out.println("Stripped out is: "+sBuffer);
		return sBuffer;
	}
}
