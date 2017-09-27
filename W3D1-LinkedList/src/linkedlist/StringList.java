package linkedlist;

import java.util.*;

public class StringList extends LinkedList{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LinkedList stringList;
	
	StringList(){
		stringList = new LinkedList();
	}
	
	StringList(String str){
		String st = str;
		for(int i=0; i<str.length(); i++) {
			System.out.println(st.charAt(i));
			stringList.add(st.charAt(i));
		}
	}
	
	/**
	 * reads in a string from the terminal
	 */
	
	public void readString(String inputString) {
		for(int i = 0; i < inputString.length(); ++i) {
			stringList.add( inputString.charAt(i));
		}
	}
	
	/*
	 * writes a LinkedList to the terminal.
	 * @linkedList LinkedList, the list to write to terminal
	 */
	public void writeString() {
		Iterator iterator = stringList.listIterator(0);
		String out = "";
		while(iterator.hasNext()) {
			out += iterator.next();
		}
		System.out.println(out);;
	}
	
	/**
	 * initializes a LinkedList to null
	 * @param LinkedList list the list to clear
	 */
	public void clear() {
		stringList = null;
	}
	
	/**
	 * returns the length of a LinkedList
	 * uses an iterator 
	 * len(LinkedList) -- returns the length of a LinkedList.  Use an Iterator for this method.
	 * @param LinkedList list
	 */

	public int len() {
		int i = 0;
		if(stringList != null) {
			Iterator iterator = stringList.iterator();
			while(iterator.hasNext()) {
				iterator.next();
				i++;
			}
		}
		return i;
	}
	
	/**
	 * tests whether or not two LinkedLists are equal
	 * Use two Iterators for this method, one for each list
	 * 
	 * This is case sensitive such that A != a
	 * @param LinkedList list
	 */
	
	public boolean equal(StringList list2) {
		Iterator it1 = stringList.listIterator();
		Iterator it2 = list2.iterator();
		if(list2.len() != stringList.size()) {
			return false;
		}
		
		while( (it1.hasNext()) ) {
			System.out.format("Comparing %s%n", it1.next());
			if( it1.next() != it2.next()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * concatenates a copy of the LinkedList onto target LinkedList
	 * @param targetString, LinkedList, the list to concatenate to
	 * @param linkedList, LinkedList, the list to be concatenated
	 */
	
	public LinkedList concatenate(LinkedList anotherList) {
		LinkedList newString = stringList;
		
		return newString;
	}
     
	/**
	 * inserts a copy of the LinkedList into target LinkedList after position start
	 * @param target LinkedList list where to insert
	 * @param list the part to be inserted
	 * @start int the position to insert
	 */
	public void insert(LinkedList target, LinkedList list, int start) {
		
	}

	/**
	 * searches for the first occurrence of string in target LinkedList starting 
	 * at position start. 
	 * Returns the index where string begins in target (if it is found) or  -1  if it is not found.
	 */

	public int search(String searchValue, LinkedList target, int start) {
		
		return 1;
	}

	/**
	 * deletes a portion of a LinkedList starting at position start for a length of span
	 */
	public void delete(LinkedList list, int start, int span) {
		
	}
   
	/**
	 * target LinkedList is assigned a portion of LinkedList2 
	 * starting at position start for a length of span.
	 */
	public void substring(LinkedList target, LinkedList LinkedList2, int start, int span) {
		
	}
}
