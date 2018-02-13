package lec04.overidding;

public class A {
	private String data;
	
	public A() {
		
	}
	
	public A(String data) {
		this.data = data;
	}
	
	public static void print() {
		System.out.println("Static Method from A");
	}
	
	public void myMethod() {
		
	}
	
	@Override
	public String toString() {
		return data;
	}
	
}
