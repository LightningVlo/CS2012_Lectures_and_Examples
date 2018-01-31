package lec02;

public class ArrayDataFields {

    /*If you know the size of your array ahead of time, you can initialize the array here. Otherwise, initialize the
      array in the constructors.
    */
    //private String[] colors = new String[5];

    private String[] colors;

    public ArrayDataFields() {
        this(5);
    }

    public ArrayDataFields(int numColors) {
        this.colors = new String[numColors];
    }

    public ArrayDataFields(String[] colors) {
        this.colors = colors;
    }

    //Private method to create a copy of the colors array list.
    //This will be used in the getColors() method to prevent our array from being changed by an external shared
    //reference.
    private String[] copyColors() {
        String[] colorCopy = new String[this.colors.length];

        System.arraycopy(this.colors, 0, colorCopy, 0, this.colors.length);

        return colorCopy;
    }

    public String[] getColors() {
        return this.copyColors();
    }

    public String toString() {
        String output = "Colors: ";

        for (int i = 0 ; i < this.colors.length ; i++ ) {
            output += this.colors[i] + " ";
        }

        return output;
    }
}