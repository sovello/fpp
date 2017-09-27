package assignment44;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(23);
		Rectangle rectangle = new Rectangle(23, 43.5);
		Triangle triangle = new Triangle(24.783, 76.321);
		
		System.out.format("Area of Triangle is %5.2f%n", circle.computeArea());
		System.out.format("Area of Rectangle is: %5.2f%n", rectangle.computeArea());
		System.out.format("Areas of Triangle is: %5.2f%n", triangle.computeArea());
	}
}
