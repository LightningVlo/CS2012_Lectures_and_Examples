package lec05.equals;

public class OverridingEqualsDemo {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass(2, 5);
		MyClass mc2 = new MyClass(2, 5);
		
		System.out.println(mc1.equals(mc2));
		
		
		

	}

}
