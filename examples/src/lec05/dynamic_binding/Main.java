package lec05.dynamic_binding;

public class Main {

	public static void main(String[] args) {
		A x = new A();
		A y = new B();
		A z = new C();
		
		//Illustrate which version of myMethod is called even though
		//the declared type for x, y, and z is A.
		x.myMethod();
		y.myMethod();
		z.myMethod();
		System.out.println();
		
		//Illustrates which toString() methods are called along
		//the inheritance chain
		System.out.println("x has an actual type of A:");
		System.out.println("toString() output: " + x);
		
		System.out.println();
		
		System.out.println("y has an actual type of B");
		System.out.println("toString() output: " + y);
		
		System.out.println();
		
		System.out.println("z has an actual type of C");
		System.out.println("toString() output: " + z);
	}
}