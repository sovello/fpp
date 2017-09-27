package recursion;



public class Exponential {
	
	public static double power(int x, int n) {
		//n is positive
		if( n > 0) {
			return x * power(x, n-1);
		}
		//n is negative
		else if( n < 0) {
			return 1 / (x * power(x, Math.abs(n)-1));
		}
		else if (n == 0) {
			return 1;
		}
		else {
			return 1;
		}
	}
	
	//for a power that is not an integer
	public static double power(int x, double n) {
		//n is positive
		if( n > 0) {
			return x * power(x, n-1);
		}
		//n is negative
		else if( n < 0) {
			return 1 / (x * power(x, Math.abs(n)-1));
		}
		else if (n == 0) {
			return 1;
		}
		else {
			return 1;
		}
	}
	
	public double newtonRaphson(int x, double n) {
		//x1 = x0 
		return 0.2;
	}
	
}
