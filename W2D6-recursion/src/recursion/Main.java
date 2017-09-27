package recursion;

public class Main {
	
	public static void main(String[] args) {
		
		int x = -2;
		int n = -2;
		double product = Exponential.power(x, n);
		System.out.format("The product of %d raised to %d is %f%n", x, n, product );
	}
}
