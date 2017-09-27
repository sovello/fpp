package binarysearchtreeAPI;

import java.util.*;

public class BinarySearchTreeMap<K, V> extends TreeMap<K, V> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TreeMap<K, V> binarySearchTree;
	
	public BinarySearchTreeMap() {
		binarySearchTree = new TreeMap<K, V>();
	}
	
}
