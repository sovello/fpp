package assignment44;

public class Rectangle {
	
	private double length;
	private double width;
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double computeArea() {
		return width * length;
	}
}
