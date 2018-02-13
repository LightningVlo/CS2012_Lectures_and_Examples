package lec04.shapes;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		this.dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		this.dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}

	private void myMethod() {

	}


}