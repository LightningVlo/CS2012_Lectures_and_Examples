package lec05.dynamic_binding;

public class C extends B {
	private int z = 10;
	
	public C() {
		
	}
	
	public C(int z) {
		this.z = z;
	}
	
	@Override
	public void myMethod() {
		System.out.println("Calling myMethod() from C");
	}
	
	public String toString() {
		System.out.println("Calling toString() from C");
		String out = "";
		
		//Add the output from the super.toString() to out first.
		out += super.toString();
		
		//Add the output that comes from this class.
		out += "z: " + this.z + " ";
		
		return out;
	}
	
	
//	public void myMethod() {
//		System.out.println("Method from C");
//	}
}
