package assignment54;


public class Square extends ClosedCurve implements Polygon {
	double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	
	public int getNumberOfSides() {
		return 4;
	}
	public double computePerimeter() {
		return side * 4;
	}
	
	public String toString() {
		return "Square";
	}
	public double computeArea() {
		return(side*side);
	}
}
