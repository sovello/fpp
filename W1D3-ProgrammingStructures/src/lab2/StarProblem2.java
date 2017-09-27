package lab2;

/**
 * 
 * @author fugit
 *
 */
public class StarProblem2 {
	public static void main(String[] args) {
		int stars = 6;
		int space = stars-1;
		for (int i = 0; i < stars-1; i++) {
			if( space > 0) {
				String pad = String.format("%"+space+"s", " ");
				System.out.format(pad);
				space -= 1;
			}
			for (int j = 0; j < i+1; j++) {
				
				if(j == 0) {
					System.out.format("%s", "*");
				}
				else if( j == i) {
					System.out.format("%s", "*");
				}
				else {
					System.out.format("%s", " ");
				}
				
			}
			System.out.println();
		}
		//print last line
		for( int k = 0; k < stars; k++) {
			System.out.format("%s", "*");
		}
		System.out.println();
		
	}
}
