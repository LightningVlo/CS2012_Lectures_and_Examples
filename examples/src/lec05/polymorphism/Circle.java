package lec05.polymorphism;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() { }

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		//Or we could use:
		//super(color, filled);
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
