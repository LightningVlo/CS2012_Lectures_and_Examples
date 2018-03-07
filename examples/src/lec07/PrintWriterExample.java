package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class PrintWriterExample {

    public static void main(String[] args) {

        try {
            generateTestData(10);
        }
        catch (FileNotFoundException ex) {
            //Error code
        }


    }

    public static void generateTestData(int n) throws FileNotFoundException {
        File outFile = new File("resources/randomData.txt");

        PrintWriter pw = new PrintWriter(outFile);

        Random random = new Random();

        for (int i = 1 ; i <= n ; i++) {
            int r = random.nextInt(101);
        }

        pw.flush();
    }

}
