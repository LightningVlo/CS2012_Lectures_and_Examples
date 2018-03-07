package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileData {

    public static void main(String[] args) {
        File inFile = new File("resources/randomData.txt");

        try {
            Scanner in = new Scanner(inFile);

            while (in.hasNextDouble()) {
                System.out.print(in.nextDouble() + " ");
            }

        }
        catch (FileNotFoundException ex) {
            //Error handling.
        }




    }
}
