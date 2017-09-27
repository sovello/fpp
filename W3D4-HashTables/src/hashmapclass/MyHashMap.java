package hashmapclass;

import java.util.*;

public class MyHashMap<K, V> extends HashMap<K, V>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<K, V> myHashMap;
	
	public MyHashMap() {
		myHashMap = new HashMap<K, V>();
	}

	/**
	 * HashTable Search
	 */
	
	public void search(K key) {
		if( this.get(key) != null) {
			System.out.format("\t=>Found: %s (Tel: %s)\n", key, this.get(key));
			return;
		}
		System.out.println("Sorry, Search key not found!");
	}
	
	/**
	 * Print each index value in the hash table followed by 
	 * all the key fields (names) of the entries stored at that index.
	 */
	public <E> void printHashTableKeysAndValues() {
		Set<K> keys = this.keySet(); //returns all keys as a set, that you can iterate through
		Iterator<K> iterator = keys.iterator();
		while(iterator.hasNext()) {
			K key  = iterator.next();
			System.out.format("Name: %s\n   =>Mobile: %s\n", key, this.get(key));
		}
	}
}