package assignment54;

public class Circle extends ClosedCurve{
	double radius;
	public Circle(Double radius){
		this(radius.doubleValue());
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public int getNumberOfSides() {
		return 0;
	}
	
	public double computePerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public String toString() {
		return "Circle";
	}
	
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
