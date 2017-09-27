package exceptions;

import java.io.IOException;

public class AgeMain {
	public static void main(String[] args) {
		AgeInputVerification verification = new AgeInputVerification();
		// Test Cases
		// 
		// enter a digit like 234 expected: OK
		// enter a float like 23.0 expected: Error
		// a string expected: Error
		// a string with numbers expected: Error
		// an empty string expected: Error
		
		//int age = verification.getAge();
		//verification.getAge();
		//assert age < 0 : "Only age between 0 and 1 allowed";
        //assert age > 140 : "Only age between 0 and 140 allowed";
		
		ListOfNumbers lNum = new ListOfNumbers();
		try {
			lNum.writeList();
		}
		catch(IOException e) {
			System.out.println("There was an error: "+e.getMessage());
		}
	}
}
