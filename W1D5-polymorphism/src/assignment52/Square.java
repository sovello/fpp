package assignment52;


public class Square extends ClosedCurve {
	double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	
	public String toString() {
		return "Square";
	}
	double computeArea() {
		return(side*side);
	}
}
