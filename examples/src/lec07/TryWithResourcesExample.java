package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TryWithResourcesExample {


    public static void main(String[] args) {

        generateTestData(10);


    }

    public static void generateTestData(int n) {
        File outFile = new File("resources/randomData.txt");

        try(PrintWriter pw = new PrintWriter(outFile)) {
            Random random = new Random();

            for (int i = 1 ; i <= n ; i++) {
                int r = random.nextInt(101);
                pw.println(r);
            }
        }
        catch(FileNotFoundException ex) {

        }
    }


}
