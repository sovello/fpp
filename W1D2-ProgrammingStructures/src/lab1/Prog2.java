package lab1;

/*
 * Create a class Prog2. Inside its main method, 
 * create float variables to store each of the
   following numbers:    1.27, 3.881, 9.6
  Output to the console the following two values:
  a. the sum of the floats as an integer, 
  obtained by casting the sum to type int
  b. the sum of the floats as an integer, 
  obtained by rounding the sum to the nearest
     integer, using the Math.round function
 */
public class Prog2 {
	public static void main(String[] args) {
		double x = 1.27;
		double y = 3.881;
		double z = 9.6;
		double sum = x + y +z;
		System.out.println("The cast sum is: "+ (int)sum);
		System.out.println("The rounded sum is: "+ Math.round(sum));
	}
}
