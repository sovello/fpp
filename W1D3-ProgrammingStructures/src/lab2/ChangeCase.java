package lab2;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		StringBuffer sentence = new StringBuffer(sc.nextLine());
		sc.close();
		System.out.format("Original Sentence: %s%n", sentence);
		for( int i = 0; i < sentence.length(); i++ ) {
			if(Character.isLowerCase(sentence.charAt(i))) {
				sentence.setCharAt(i, Character.toUpperCase(sentence.charAt(i)));
			}
			else {
				sentence.setCharAt(i, Character.toLowerCase(sentence.charAt(i)));
			}
		}
		System.out.format("Formated Sentence: %s%n", sentence);
	}
}
