package binary_search_tree;

import java.util.*;

public class BSTMain {
	private static MyBST binarySearchTree = new MyBST();
	public static void main(String[] args) {
		//int[] integer = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25}; //565, 3, 654,56,34,654,75,87,22,56,97,4,24,32,45};
		int[] integer = {2, 0, -2, 12, 4, 8, 3};
		for(int i = 0; i < integer.length; i++) {
			
			binarySearchTree.insert( integer[i] );
		}
		
		binarySearchTree.printTree();
		
		System.out.println( binarySearchTree.countNodes());
		System.out.println( binarySearchTree.countLeaves());
		System.out.println("All even: "+binarySearchTree.allEven());
		System.out.format("There's %d odd numbers\n", binarySearchTree.countOddNumbers());
		System.out.println("Minimum entry: "+binarySearchTree.findMinimum());
	}
}
