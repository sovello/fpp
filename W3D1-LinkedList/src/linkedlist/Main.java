package linkedlist;

import java.util.*;
public class Main {
	
	
	private static LinkedList<Character> A;
	private static LinkedList<Character> B;
	private static LinkedList<Character> C;
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		A = readString();
		B = readString();
		C = readString();
		
		System.out.println(A.getClass());
		print("A: ");
		writeString(A);
		print("B: ");
		writeString(B);
		print("C: ");
		writeString(C);
		//clear(A);
		//clear(B);
		System.out.println(len(A));
		if( equal(A, B)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		print("Concatenating A to B\n");
		writeString(concatenate(A, B));
		try {
			insert(B, C, 3);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("You have to insert within the string limits");
		}
		print("When C inserted to B, now B: ");
		writeString(B);
		print("Searching for Hil in B\n");
		String found = search("mganie", B, 0) >= 1 ? "Found" : "Not found";
		System.out.println(found);
		print("Deleting... from B becomes\n");
		try{
			delete(B, 15, 30);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("You can not delete beyond string length");
		}
		writeString(B);
		
		print("Substringing B from 3 for 4 chars\n");
		substring(C, B, 3, 4);
		writeString(C);
		
	}
	
	public static void print(String str) {
		System.out.print(str);
	}
	public static LinkedList<Character> readString() {
		System.out.print("Please enter string: ");
		String inputString = sc.nextLine();
		LinkedList<Character> str = new LinkedList<Character>();
		for(int i=0; i<inputString.length(); i++) {
			str.add(inputString.charAt(i));
		}
		
		return str;
	}
	
	public static void writeString(LinkedList<Character> str) {
		Iterator<Character> iterator = str.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();
	}
	
	public static void clear(LinkedList<Character> str) {
		Iterator<Character> it = str.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
	}
	
	public static int len(LinkedList<Character> str) {
		Iterator<Character> it = str.iterator();
		int count = 0;
		while(it.hasNext()) {
			it.next();
			count++;
		}
		return count;
	}
	
	/**
	 * the method is case sensitive such that r != R
	 * @param str1 the first linkedlist
	 * @param str2 the second linkedlist
	 * @return
	 */
	public static boolean equal(LinkedList<Character> str1, LinkedList<Character> str2) {
		Iterator<Character> it1 = str1.iterator();
		Iterator<Character> it2 = str2.iterator();
		if(len(str1) != len(str2)) {
			return false;
		}
		//to this point the lenghts are the same, so we can use just one iterator
		while(it1.hasNext()) {
			if( it1.next() != it2.next() ) {
				return true;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * this way we need an intermediate LinkedList
	 * use the addAll() method of LinkedList
	 * so this way we
	 * @param target
	 * @param toConcat
	 * @return
	 */
	public static LinkedList<Character> concatenate(LinkedList<Character> target, 
			LinkedList<Character> toConcat){
		LinkedList<Character> concatenatedString = new LinkedList<Character>();
		concatenatedString = target;
		concatenatedString.addAll(toConcat);
		return concatenatedString;
	}
	
	/**
	 * inserts a copy of the LinkedList into target LinkedList after position start
	 * we are not going to modify the original
	 * @param target the LinkedList where we want to insert
	 * @param insertString the string to insert
	 * @start the position where we insert
	 */
	public static void insert(LinkedList<Character> target, 
			LinkedList<Character> insertString, int start) throws IndexOutOfBoundsException{
		target.addAll(start, insertString);
	}
	
	/**
	 * searches for the first occurrence of string in target LinkedList starting 
	 * at position start. 
	 * Returns the index where string begins in target (if it is found) or  -1  if it is not found.
	 */

	public static int search(String needle, LinkedList<Character> haystack, int start) {
		//get length of the substring to search: target.length() - start + 1 (+1 considering the user position)
		// return -1 if shorter than what we are searching for
		//we iterate as many times as there are characters in haystack
		//first loop executes from where we are supposed to be searching from
		//second loop executes after we have found the first letter
			//if we don't find consecutive letters in the inner loop we go up and start 
			// from the last index
		int max = haystack.size()-needle.length();
	search: for(int i = start; i <= max; i++) {
			 int needleSize = needle.length();
			while(needleSize-- > 0) {
				int j = i;
				int k = 0;
				if(haystack.get(j++) != needle.charAt(k++)) {
					continue search;
				}
			}
			return 1;
		}
		
		return -1;
	}
	
	/**
	 * deletes a portion of a LinkedList starting at position start for a length of span
	 */
	public static void delete(LinkedList<Character> list, int start, int span) throws IndexOutOfBoundsException{
		for(int i = 0; i < span; i++) {
			list.remove(start-1);
		}
	}
	
	/**
	 * target LinkedList is assigned a portion of LinkedList2 
	 * starting at position start for a length of span.
	 * 
	 * ASSUMPTION: the portion is from linkedlist2 with the said dimensions
	 */
	public static void substring(LinkedList<Character> target, LinkedList<Character> linkedList2, int start, int span)
							throws IndexOutOfBoundsException {
		clear(target);
		for(int i = 0; i<span; i++) {
			target.add( linkedList2.get(start) );
			start++;
		}
	}
}
