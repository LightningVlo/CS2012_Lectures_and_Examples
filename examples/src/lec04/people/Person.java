package lec04.people;

/*The super class of Employee.  A superclass must always be
 * instantiated BEFORE any of its subclasses.
 */

public class Person {
	public Person() {
		/*We are at the top of our inheritance chain (technically Object
		 * is the top level but we can ignore that distinction for this example)
		 * 
		 * Now we can continue on with all the code in the Person constructor.
		 */
		
		System.out.println("(1) Performs Person's tasks");
		
		//At this point jump back to Employee.
	}
}
