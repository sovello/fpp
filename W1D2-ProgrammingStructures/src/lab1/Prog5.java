package lab1;

import java.util.*;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a string: ");
		String userInput = sc.nextLine();
		sc.close();
		int xCount = 0;
		for (int i = userInput.length()-1; i >= 0; i--) {
			System.out.print(userInput.charAt(i));
			if (userInput.toLowerCase().charAt(i) == 'x') {
				xCount += 1;
			}
		}
		System.out.format("%n%d 'x' characters", xCount);
	}
}
