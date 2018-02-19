package lec05.dynamic_binding;

public class B extends A {
	private int y = 5;
	
	public B() {
		
	}
	
	public B(int y) {
		this.y = y;
	}
	
	@Override
	public void myMethod() {
		System.out.println("Calling myMethod() from B");
	}
	
	@Override
	public String toString() {
		System.out.println("Calling toString() from B.");
		
		String out = "";
		
		//Add the output from the super.toString() to out first.
		out += super.toString();
		
		//Add the output that comes from this class.
		out += "y: " + this.y + " ";
		
		return out;
	}
	
}
