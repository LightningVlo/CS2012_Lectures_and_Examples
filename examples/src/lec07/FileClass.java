package lec07;

import java.io.File;

public class FileClass {

    public static void main(String[] args) {
        File inFile = new File("resources/test.txt");

        System.out.println(inFile.exists());

        if (!inFile.exists()) {

        }

    }

}