package lab2;

/**
 * 
 * @author fugit
 *
 */
public class StarProblem1 {
	public static void main(String[] args) {
		int stars = 6;
		for (int i = 0; i < stars-1; i++) {
			for (int j = 0; j < i+1; j++) {
				if (j == 0)
					System.out.print("*");
				if ( i == j && i > 0) {
					int space = 0;
					String pad;
					if(i > 1) {
						space = i - 1;
						pad = String.format("%"+space+"s", " ");
						System.out.format("%s%s", pad, "*");
					}else {
						System.out.format("%s","*");
					}
				}	
			}
			System.out.println();
		}
		for(int k = 0; k < stars; k++) {
			System.out.print("*");
		}
	}
}
