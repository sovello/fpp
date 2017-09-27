package assignment44;

public class Triangle {
	
	private double base;
	private double height;
	
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return (base * height) / 2;
	}
}
