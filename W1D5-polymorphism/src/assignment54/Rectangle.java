package assignment54;

public class Rectangle extends ClosedCurve implements Polygon{
	private double length;
	private double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public int getNumberOfSides() {
		return 4;
	}
	
	public double computePerimeter() {
		return (length + width) * 2;
	}
	
	public String toString() {
		return "Rectangle";
	}
	public double computeArea() {
		return length * width;
	}
}
