package lec04.overidding;

public class B extends A {

	
	public B() {
		A.print();
	}
	
	@Override
	public void myMethod() {
		
	}
	
	public static void print() {
		System.out.println("Static Method from B");
	}
	
	
}
