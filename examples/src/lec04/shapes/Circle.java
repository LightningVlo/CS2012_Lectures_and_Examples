package lec04.shapes;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
		this.radius = 1;
	}

	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.setRadius(radius);
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

//	public void printCircle() {
//		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
//	}

	@Override
	public String toString() {
		String output = super.toString();

		output += "\n radius: " + this.radius;

		return output;
	}






}
//super(color, filled);