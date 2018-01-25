package lec01;

import java.util.Scanner;

public class TriangleMain {

    public static void main(String[] args) {
        //Creating two triangle objects using the constructors
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3, 4, 3);

        //Printing the Triangle objects with the toString() method.
        System.out.println(t1);
        System.out.println(t2);

        printTriangleMath(t1);
        System.out.println();
        printTriangleMath(t2);

        Triangle t3 = triangleWithUserInput();
        System.out.println(t3);
    }

    /**
     * This method demonstrates how to pass an object to a method.
     *
     * @param t The Triangle object being passed to the method.
     */
    public static void printTriangleMath(Triangle t) {
        System.out.println("Area = " + t.area());
        System.out.println("Perimeter = " + t.perimeter());
    }

    /**
     * This method shows how to create a Triangle object in a method and return that object.  It also shows how to
     * pass user input values to an object constructor.
     * @return  A Triangle object created from user input.
     */

    public static Triangle triangleWithUserInput() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the lengths of the three sides of a triangle: ");
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();

        Triangle userTriangle = new Triangle(s1, s2, s3);

        return userTriangle;
    }
}