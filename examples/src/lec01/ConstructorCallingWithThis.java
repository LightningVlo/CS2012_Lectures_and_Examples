package lec01;

public class ConstructorCallingWithThis {

    private String s;
    private int a;
    private double b;

    public ConstructorCallingWithThis() {
        this(7, 3.4, "java");
    }

    public ConstructorCallingWithThis(int a, double b) {
        this.setA(a);
        this.b = b;
    }

    public ConstructorCallingWithThis(int a, double b, String s) {
        this(a, b);
        this.s = s;
    }

    public void setA(int a) {
        //Validation logic for data field a would go here.
    }
    
}
