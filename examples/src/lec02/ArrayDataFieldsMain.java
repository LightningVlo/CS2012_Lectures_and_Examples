package lec02;

public class ArrayDataFieldsMain {
    public static void main(String[] args) {

        String[] colors2 = new String[6];
        colors2[0] = "blue";
        colors2[1] = "red";
        colors2[2] = "green";
        colors2[3] = "pink";
        colors2[4] = "orange";
        colors2[5] = "yellow";

        ArrayDataFields adf = new ArrayDataFields(colors2);

        System.out.println(adf);
    }
}
