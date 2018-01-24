package lec01;

/**
 * Author: Keenan Knaur
 *
 * Description: A class which is used to model a Triangle.  Includes methods to compute the perimeter and area. Area
 * is computed using Heron's Formula.
 */

public class Triangle {
    //Data fields (These should generally be private)
    private double side1Length;
    private double side2Length;
    private double side3Length;

    //Constructors
    public Triangle() {
        //this(1, 1, 1);        //Using "this" to call another constructor.
        this.side1Length = 1;
        this.side2Length = 1;
        this.side3Length = 1;
    }

    public Triangle(double side1Length, double side2Length, double side3Length) {
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
    }

    //Getters / Accessors
    public double getSide1Length() {
        return this.side1Length;
    }

    public double getSide2Length() {
        return this.side2Length;
    }

    public double getSide3Length() {
        return this.side3Length;
    }


    //Setters / Mutators
    public void setSide1Length(double side1Length) {
        this.side1Length = side1Length;
    }

    public void setSide2Length(double side2Length) {
        this.side2Length = side2Length;
    }

    public void setSide3Length(double side3Length) {
        this.side3Length = side3Length;
    }


    //Other Methods
    public double perimeter() {
        return this.side1Length + this.side2Length + this.side3Length;
    }

    /**
     * Computes the area of this Triangle using Heron's Formula.
     * @return  The area of the Triangle as a double.
     */
    public double area() {
        double s = this.perimeter() / 2;

        double area = Math.sqrt(s * (s - this.side1Length) * (s - this.side2Length) * (s - this.side3Length));
        return area;
    }

    //toString() method
    public String toString() {
        return "";
    }



}