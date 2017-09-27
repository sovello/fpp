package assignment44;

public class Circle {
	
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
