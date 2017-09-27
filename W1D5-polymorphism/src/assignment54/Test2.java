package assignment54;

public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(4, 3)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.format(""+
					"For this %s%n"+
					"  Number of Sides = %d%n"+
					"  Perimeter = %.1f%n"+
					"  Its area = %.1f%n",
					cc, cc.getNumberOfSides(), cc.computePerimeter(),
					cc.computeArea());
			
		}
    
	}

}