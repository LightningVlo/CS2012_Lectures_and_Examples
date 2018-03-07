package lec07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVExample {
    public static void main(String[] args) {
        File test_csv = new File("resources/testData2.csv");

        try(Scanner in = new Scanner(test_csv)) {
            //n.useDelimiter(",");

            while(in.hasNextLine()) {
                String nextLine = in.nextLine();

                String[] tokens = nextLine.split(",");

                //You can take the tokens array and now use the values wherever.
            }
        }
        catch (FileNotFoundException ex) {
            //Exception code
        }

    }
}
