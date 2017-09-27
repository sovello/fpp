package lab1;

import java.util.*;
/*
 * Write a program that asks the user to enter a String. The program then writes to console
all substrings of this String. (By "substring", we mean any sequence of characters that
occur consecutively and in the same order in the given String. Therefore, "erg" is a
substring of "energy", but "gre" and "eng" are not. Note that the empty string "" is
considered a substring of every string.)
Note: You will need to make sure that you do not output the same substring twice. For
instance, if the user types in "abbab", you might accidentally output the String "ab" twice,
since it occurs in two places in this String
 */

public class AllSubstrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//considering a single word string
		System.out.print("Please enter any string: ");
		String userInputString = sc.nextLine();
		sc.close();
		int stringLength = userInputString.length();
		for (int length = 0; length <= stringLength; length++ ) {
			String allStrings = ""; //holds all strings collected to control dupes
			System.out.println("Substrings of length " + length);
			int endIndex = length;
			if( endIndex == 0) {
				System.out.println("[]");
			}
			else if(endIndex == stringLength) {
				System.out.println("["+userInputString+"]");
			}
			else {
				for( int beginIndex = 0; beginIndex < stringLength; beginIndex++) {
					if (endIndex - stringLength > 0) {
						break;
					}
					String str = userInputString.substring(beginIndex, endIndex);
					if ( allStrings.indexOf("["+str+"]") == -1) {
						System.out.println("["+ str +"]");
					}
					allStrings += "["+str+"]";
					endIndex += 1;
				}
			}
		}
	}
}
