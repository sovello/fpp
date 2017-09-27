package binary_search_tree;

public class MyBST {
	/** The tree root. */
	private Node root;
	private int nodes = 0;
	private int leaves = 0;
	//start with an empty tree
	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			System.out.print("In-order: ");
			printTree(root);
			System.out.print("\nPre-order: ");
			printTreePreOrder(root);
			System.out.print("\nPost-order: ");
			printTreePostOrder(root);
			System.out.println();
	}

	//in-order LVR
	private void printTree(Node t) {
		if ( t != null ) {
			printTree(t.left);
			System.out.print(t.element + " ");
			printTree(t.right);
		}
	}
	
	//pre-order VLR
	private void printTreePreOrder(Node t) {
		if(t != null) {
			System.out.print(t.element + " ");
			printTreePreOrder(t.left);
			printTreePreOrder(t.right);
		}
	}
	
	//post-order LRV
	private void printTreePostOrder(Node t) {
		if(t != null ) {
			printTreePostOrder(t.left);
			printTreePostOrder(t.right);
			System.out.print(t.element + " ");
		}
	}
	
	public int countNodes() {
		return countNodes(root);
	}
	
	public int countLeaves() {
		return countLeaves(root);
	}
	
	/** 
	 * should return the number of nodes in the tree.
	 * @param node, the root of the tree
	 * @return int number of nodes
	 */
	
	public int countNodes(Node node) {
		if(node == null) {
			return 0;
		}
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
	
	/**
	 * this method counts how many odd numbers are in a given tree
	 * @param Node
	 * @return int number of even numbers in the tree
	 */
	
	public int countOddNumbers() {
		return countOddNumbers(root);
	}
	
	private int countOddNumbers(Node node) {
		if(node == null) {
			return 0;
		}
		if( node.element % 2 == 1) {
			return 1;
		}
		else {
			return countOddNumbers(node.left) + countOddNumbers(node.right);
		}
	}
	
	/**
	 * finds the minimum value in the tree
	 * @param node, the root of tree we are traversing
	 * @return Integer or null if the node is null
	 */
	
	public Integer findMinimum() {
		return findMinimum(root);
	}
	
	private Integer findMinimum(Node node) {
		if(node == null ) {
			return null;
		}
		
		if( node.left == null) {
			return new Integer(node.element);
		}
		else {
			return findMinimum(node.left);
		}
	}
	
	
	/**
	 * checks if all elements in a tree are even
	 * @param Node, the root of the tree we are traversing
	 * @return boolean, true if all numbers are even, false otherwise
	 */
	public boolean allEven() {
		return allEven(root);
	}
	
	private boolean allEven(Node node) {
		if(node == null) {
			return true;
		}
		if( node.element % 2 == 1) {
			return false;
		}
		else {
			return allEven(node.left) && allEven(node.right);
		}
	}
	/**
	 * should return the number of leaves
	 * @param node Node the root of the tree
	 * @return numleaves int number of leaves in the tree
	 */
	
	public int countLeaves(Node node) {
		if( node == null) {
			return 0;
		}
		if( node.left == null && node.right == null) {
			return 1;
		}
		return  countLeaves(node.left) + countLeaves(node.right);
	}
	
	public boolean find(Integer x) {
		if(x==null) return false;
		return find(x,root);
	}
	
	private boolean find(Integer x, Node n){
		if(n == null) return false;
		if(n != null && n.element.equals(x)) return true;
		return (x.compareTo(n.element) < 0) ?
				find(x,n.left) :
				find(x,n.right);
		//return find(x,n.left) || find(x,n.right);
	}

	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
		}
		else {
			Node n = root;
			boolean inserted = false;
			while(!inserted){
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}
				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
				
			}

		}
	}
	
	private class Node {
		
		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
		
		// Constructors
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}
}