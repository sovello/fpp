package lab2;

public class MinimumInteger {
	public static void main(String[] args) {
		int[] ints = {-42, 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}; 
		int minInt = min(ints);
		System.out.format("The minimum is %d%n",minInt  );
	}
	
	static int min(int[] arrayOfInts) {
		int minInt = 0; //start with zero, so that every time a new minimum is found, min changes to that
		for(int i = 0; i < arrayOfInts.length; i++) {
			if( arrayOfInts[i] < minInt ) {
				minInt = arrayOfInts[i];
			}
		}
		return minInt;
	}
}


