package lec05.dynamic_binding;

public class A {
	private int x = 0;
	
	public A() {
		
	}
	
	public A(int x) {
		this.x = x;
	}
	
	
	
	public void myMethod() {
		System.out.println("Calling myMethod() from A");
	}
	
	public String toString() {
		System.out.println("Calling toString() from A.");
		String out = "";
		
		//Add the output that comes from this class.
		out += "x: " + this.x + " ";
		
		return out;
	}
}
