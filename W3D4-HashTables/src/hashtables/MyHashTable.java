package hashtables;

import java.util.*;
import java.util.Map.Entry;

public class MyHashTable{
	private static final int INITIAL_SIZE;
	static {
		INITIAL_SIZE = 19;
	}
	
	private int tableSize;
	private LinkedList[] table;
	public MyHashTable() {
		this(INITIAL_SIZE);
	}
	
	public MyHashTable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize]; //an array of LinkedList objects
	}
	
	public void put(Object key, Object value) {
		//disallow null keys
		if (key == null) {
			return;
		}
		//the big integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot (namely, hash)
		
		//allows a null value
		Entry e = new Entry(key, value);
		
		//now place it in the table
		if(table[hash] == null) {
			table[hash] = new LinkedList();
		}
		//this allows duplicate keys
		/**
		 * Try to insert a duplicate value for the name field.  
		 * Have the program print out an error message in this situation, and then continue.
		 */
		if( this.get(e.key) != null) {
			System.out.format("%s is already in. Skipping...\n", e.key);
		}
		else {
			table[hash].add(e);
		}
	}
	
	public Object get(Object key) {
		//null key not allowed
		if(key == null) return null;
		
		//get the big integer corresponding to the object slot
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//now look for the desired Entry
		Entry e = null;
		
		//First we should make sure that table[hash]
		//is not null. If it is, then the 
		//Entry is not there
		
		Iterator it = table[hash].iterator();
		while(it.hasNext()) {
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null; //Not found
	}
	
	public String toString() {
		String n = System.getProperty("line.separator"); // a new line
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length; i++) {
			if(table[i] != null) {
				Iterator it = table[i].iterator(); //for the LinkedList at table[i]
				Entry next = null;
				while(it.hasNext()) {
					next = (Entry)it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}
	
	
	//In the java file this method might be called hash
	private int hashM(int bigNum) {
		return Math.abs( bigNum % tableSize );
	}
	
	private class Entry{
		private Object key;
		private Object value;
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		
		public String toString() {
			return key.toString()+"->"+value.toString();
		}
	}

	/**
	 * HashTable Search
	 */
	
	public void search(Object key) {
		//if( key == null) return null;
		//get hashcode
		int hashcode = key.hashCode();
		//get node
		int hash = hashM(hashcode);
		
		Entry entry = null;
		
		Iterator it = table[hash].iterator();
		while( it.hasNext()) {
			entry = (Entry) it.next();
			
			if(entry.key.equals(key)) {
				System.out.format("==>Found: %s (Tel: %s)\n", entry.key, entry.value);
				return;
			}
		}
		System.out.println("Sorry, Search key not found!");
	}
	
	/**
	 * Print each index value in the hash table followed by 
	 * all the key fields (names) of the entries stored at that index.
	 */
	public void printHashTableIndexAndKeys() {
		//loop through the table (an array)
		System.out.format("%s %7s\n", "INDEX", "KEY");
		for( int i = 0; i < this.tableSize; i++ ) {
			System.out.print("  "+i+". ");
			try {
				if( this.table[i].size() == 0) {
					System.out.format("%5d\n", 0);
				}
				else {
					System.out.format("%5s", " ");
					while(!this.table[i].isEmpty()) {
						Entry entry = (Entry)this.table[i].remove();
						System.out.format("%s, ", entry.key);
					}
					System.out.println();
				}
			}
			catch(NullPointerException e) {
				System.out.format("%9sThere is no index\n", " ");
			}
		}
		
	}

	/**
	 * Write a method that counts the number of elements in the hash table by traversing the hash 
	 * table and the LinkedList chains.  Test it Thoroughly!
	 */
	public int getNumberOfElements() {
		int numElements = 0;
		//go through each node in the table
		
		for( int i = 0; i < this.tableSize; i++) {
		//for each node, loop through the element found.
			
			try {
				numElements += this.table[i].size();
			}
			catch( NullPointerException e) {
				System.err.format("Index %d is not in the table\n", i);
			}
		}
		return numElements;
	}
	
	/**
	 * Write a method that returns the number of elements in the longest LinkedList chain.  Test it!
	 */
	public int elementsInLongestList() {
		int largest = 0;
		for(int i = 0; i < this.tableSize; i++) {
			try {
				int cellSize = this.table[i].size();
				if( largest <= cellSize ) {
					largest = cellSize;
				}
			}
			catch(NullPointerException e) {
				System.err.format("Index %s is null\n", i);
			}
		}
		
		return largest;
	}
}