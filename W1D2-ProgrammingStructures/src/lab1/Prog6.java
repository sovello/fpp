package lab1;

public class Prog6 {
	public static void main(String[] args) {
		
		String nonDuplicateString = ""; //initialize to an empty string
		String allStrings = ""; //holds all strings to control dupes
		for( int i = 0; i < args.length; i++) {
			if ( allStrings.indexOf("["+args[i]+"]") == -1) {
				nonDuplicateString += (i == args.length-1) ? args[i] : args[i]+", ";
			}
			allStrings += "["+args[i]+"]";
		}
		System.out.println(nonDuplicateString);
	}
}
