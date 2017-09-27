package lab2;

public class IntsAverage {
	
	public static void main(String[] args) {
		int[] intsArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		double average = avg(intsArray);
		System.out.format("The average of the ints is: %.2f", average);
	}
	
	public static double avg(int[] arrayOfInts) {
		int sum = 0;
		for(int i = 0; i < arrayOfInts.length; i++) {
			sum += arrayOfInts[i];
		}
		return (double) sum/arrayOfInts.length;
	}
}
