package assignment52;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius){
		this(radius.doubleValue());
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle";
	}
	
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
