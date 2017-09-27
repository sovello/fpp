package assignment52;

public class Rectangle extends ClosedCurve {
	private double length;
	private double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return "Rectangle";
	}
	public double computeArea() {
		return length * width;
	}
}
