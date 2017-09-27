package questack;

import java.util.*;

public class QueStackMain {
	private static Scanner sc = new Scanner(System.in);
	private static char OPENING_PARENTHESIS = '(';
	private static char CLOSING_PARENTHESIS = ')';
	private static char OPENING_BRACE = '{';
	private static char CLOSING_BRACE = '}';
	private static char OPENING_SQ_BRACKET = '[';
	private static char CLOSING_SQ_BRACKET = ']';
	private static char LINE_COMMENT = '/';
	private static char STAR = '*';
			
	public static void main(String[] args) {
		try {
			print(readIntegersAndPrintReversed());
		}
		catch(InputMismatchException e) {
			print("The program only accepts integers.\nSorry...\n");
		}
		
		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();
		
		String str1 = "Hildebrand";
		String str2 = "Mgani";
		
		for(int i=0; i<str1.length(); i++) {
			stack.push(str1.charAt(i));
		}
		for(int i=0; i<str2.length(); i++) {
			queue.add(str2.charAt(i));
		}
		String st = "/* /at start if it is not (in the) CLOSING report error*/\n" + 
				"		search: for( int i = 0; i<str.length(); i++) {";
		checkDelimiters( st );
		
		moveStackToQueue(stack, queue);
		moveQueueToStack(stack, queue);

		emptyStackOntoStack(stack, queue);
		println(stringComparator()+"");
		sc.close();
	}
	
	
	/**
	 * Write a method that will read one line of input from the keyboard.  The input is supposed 
	    to consist of two parts separated by a colon ':'.  As its result, your method should produce 
	    a single character as follows :
	
	            N      No colon on the line.
	            L      The left part (before the colon) is longer than the right.
	            R      The right part (after the colon) is longer than the left.
	            D      The left and right parts have the same length but are different.
	            S      The left and right parts are exactly the same.

                Examples :                 Input                  Output
                                           SampleSample            N
                                           Left:Right              R
                                           Sample:Sample           S  
	 * @return
	 * @throws InputMismatchException
	 */
	public static char stringComparator() {
		System.out.print("Enter a string with a colon: ");
		String userInput = sc.nextLine();
		int inputLength = userInput.length();
		int lengthBeforeColon = userInput.indexOf(':');
		Queue<Character> beforeColon = new LinkedList<Character>();
		Queue<Character> afterColon = new LinkedList<Character>();
		if( lengthBeforeColon < 0 ) {
			return 'N';
		}

		for(int i = 0; i < lengthBeforeColon; i++) {
			beforeColon.add(userInput.charAt(i));
		}
		for( int i = lengthBeforeColon+1; i< inputLength; i++) {
			afterColon.add(userInput.charAt(i));
		}
		
		int lengthAfterColon = afterColon.size();
		if(lengthBeforeColon <  lengthAfterColon) {
			return 'R';
		}
		
		if( lengthBeforeColon > lengthAfterColon) {
			return 'L';
		}
		if ( lengthBeforeColon == lengthAfterColon){
			for( int i = 0; i < lengthBeforeColon; i++ ) {
				if( beforeColon.remove() != afterColon.remove()) {
					return 'D';
				}
			}
		}
		return 'S';
	}
	
	public static String readIntegersAndPrintReversed() throws InputMismatchException {
		print("You should enter -1 to quit from the program\n");
		System.out.print("Enter some integers to reverse: ");
		LinkedList<Integer> ints = new LinkedList<Integer>();
		int input = 0;
		
		while(true) {
			input = Integer.parseInt(sc.nextLine());
			if(input == -1) {
				break;
			}
			else {
			ints.push(input);
			}
		}
		
		int count = ints.size();
		Iterator<Integer> iter = ints.iterator();
		String str = "You entered: ";
		
		if(count == 0) {
			return "You entered nothing\n";
		}
		
		if( count == 1) {
			return str += String.format("%d\n", ints.pop());
		}
		
		while(iter.hasNext() && count >= 0) {
			if( count == 1) {
				str += String.format("and %d.\n", ints.pop());
			}
			else {
				str += String.format("%d, ", ints.pop());
				--count;
			}
			
		}
		return str;
	}
	
	public static void print(String str) {
		System.out.print(str);
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static <T> void printList(LinkedList<T> list, String type) {
		Iterator<T> iterator = list.iterator();
		if( type.equals("queue")) {
			print("Queue: ");
			while(iterator.hasNext()) {
				print(iterator.next()+"");
			}
			println("");
		}
		if( type.equals("stack")) {
			print("Stack: ");
			while(iterator.hasNext()) {
				print( list.pop()+"" );
			}
			println("");
		}
	}
	public static void checkDelimiters(String str) {
		LinkedList<Character> symbols = new LinkedList<Character>();
		
		//at start if it is not (in the) CLOSING report error
		search: for( int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if( ch == LINE_COMMENT) {
				symbols.push(ch);
				int k = i+1;
				if( str.charAt(k) == LINE_COMMENT) {
					
					symbols.pop();
					break search;
				}
				else if (str.charAt(k) == STAR){
					symbols.push(str.charAt(k));
					for(int j = k+1; j < str.length(); j++) {
						if( (str.charAt(j) == STAR) && (str.charAt(j+1) == LINE_COMMENT)) {
							symbols.pop();
							symbols.pop();
							i = j+1;
							continue search;
						}
					}
				}
			}
			if( ch == OPENING_PARENTHESIS) {
				symbols.push('(');
			}
			else if( ch == OPENING_BRACE ) {
				symbols.push('{');
			}
			else if( ch == OPENING_SQ_BRACKET) {
				symbols.push('[');
			}
			else if( ch == CLOSING_PARENTHESIS) {
				if(symbols.isEmpty() || symbols.pop() != OPENING_PARENTHESIS) {
					print("A ) is a missing\n");
				}
			}
			else if( ch == CLOSING_BRACE) {
				if(symbols.isEmpty() || symbols.pop() != OPENING_BRACE){
					print("A } is missing.\n");
				}
			}
			else if( ch == CLOSING_SQ_BRACKET) {
				if(symbols.isEmpty() || symbols.pop() != OPENING_SQ_BRACKET){
					print("A ] is missing.\n");
				}
			}
		}
		if( symbols.isEmpty()) {
			print("The expression is balanced");
		}
		else {
			print("The expression is not balanced with "+symbols.pop()+"\n");
		}
	}

	/**
	 * a) Move all the entries from a stack into a queue.  (Definitely do for the final.)
	 */
	
	public static <T> void moveStackToQueue(LinkedList<T> stack, LinkedList<T> queue){
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}	
		printList(queue, "queue");
	}
	
	/**
	 * b)  Move all the entries from a queue onto a stack.  (Definitely do for the final.)
	 */
         
	public static <T> void moveQueueToStack(LinkedList<T> stack, Queue<T> queue) {
		Iterator<T> queueIterator = queue.iterator();
		while(queueIterator.hasNext()) {
			stack.push(queueIterator.next());
		}
		printList(stack, "stack");
	}
	
	/**
	 * c)  Empty one stack onto the top of another stack in such a way that the entries that were
	 * in the first stack keep the same relative order in the other stack.
	 */
	public static <T> void emptyStackOntoStack(LinkedList<T> targetStack, LinkedList<T> sourceStack) {
		LinkedList<T> tempStack = new LinkedList<T>();
		//move to temporary stack
		while(!sourceStack.isEmpty()) {
			tempStack.push(sourceStack.pop());
		}
		//move temporary stack to target Stack
		while(!tempStack.isEmpty()) {
			targetStack.push(tempStack.pop());
		}
		printList(targetStack, "stack");
	}
}
