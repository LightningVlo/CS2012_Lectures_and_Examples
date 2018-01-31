package lec02;

import java.util.ArrayList;

import lec01.Triangle;

public class ArrayListOfObjects {

    public static void main(String[] args) {
        ArrayList<Triangle> myList = makeTriangles();

        Triangle t1 = myList.get(0);

        System.out.println(myList.size());

        myList.add(new Triangle(5, 7, 6));

        System.out.println(myList.size());

        for (int i = 0 ; i < myList.size() ; i++) {
            System.out.println(myList.get(i).area());
        }

        myList.remove(2);

        System.out.println(myList.size());

        for (int i = 0 ; i < myList.size() ; i++) {
            System.out.println(myList.get(i).area());
        }


    }

    public static ArrayList<Triangle> makeTriangles() {
        ArrayList<Triangle> myList = new ArrayList<>();

        Triangle t1 = new Triangle(10, 10, 15);
        Triangle t2 = new Triangle(4, 3, 4);
        Triangle t3 = new Triangle(5, 5, 5);

        myList.add(t1);
        myList.add(t2);
        myList.add(t3);

        return myList;
    }






}
