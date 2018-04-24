package lec12.object_io;

import java.io.*;
import java.util.ArrayList;

public class ObjectIOArrayList {
    public static void main(String[] args) {
        Cereal c1 = new Cereal("Cap'n Crunch", "Quaker Oats Company", 14.0);
        Cereal c2 = new Cereal("Count Chocula", "General Mills", 10.7);
        Cereal c3 = new Cereal("Frosted Mini Wheats", "Kellogs", 19.0);

        ArrayList<Cereal> cereals1 = new ArrayList<>();
        ArrayList<Cereal> cereals2 = null;

        cereals1.add(c1);
        cereals1.add(c2);
        cereals1.add(c3);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("array_list.dat"));

            oos.writeObject(cereals1);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("array_list.dat"));

            cereals2 = (ArrayList<Cereal>) ois.readObject();

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for(Cereal c : cereals2) {
            System.out.println(c);
        }




    }

}
