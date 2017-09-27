package lab2;

public class StarProblem3 {
	public static void main(String[] args) {
		int stars = 11;
		int preSpace = (stars/2)+1;
		for (int i = 0; i<stars/2; i++) {
			if (i == 0) {
				System.out.format("%"+preSpace+"s%n", "*");
			}else {
				int postSpace = (i*2);
				System.out.format("%"+preSpace+"s", "*");
				System.out.format("%"+postSpace+"s%n", "*");
			}
			preSpace -= 1;
		}
		for(int k = 0; k<stars; k++) {
			System.out.format("%s", "*");
		}	
		System.out.println();
	}
}
