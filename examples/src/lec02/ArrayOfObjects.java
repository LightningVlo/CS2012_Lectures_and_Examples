package lec02;

import lec01.Triangle;

public class ArrayOfObjects {
    public static void main(String[] args) {
        //Triangle t1 = new Triangle(10, 10, 15);
        //Triangle t2 = new Triangle(4, 3, 4);
        //Triangle t3 = new Triangle(5, 5, 5);

        Triangle[] triangles = new Triangle[3];

        triangles[0] = new Triangle(10, 10, 15);
        triangles[1] = new Triangle(4, 3, 4);
        triangles[2] = new Triangle(5, 5, 5);

        printTriangleAreas(triangles);
    }

    public static void printTriangleAreas(Triangle[] triangles) {
        for(int i = 0 ; i < triangles.length; i++) {
            System.out.println("Triangle " + (i + 1) + " Area: " + triangles[i].area());
        }

    }



}
