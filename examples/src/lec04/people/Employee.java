package lec04.people;

public class Employee extends Person {

	public Employee() {
		//Here is were we enter from the Faculty class.
		
		/*We are calling an Employee constructor using "this"
		 * we are only allowed to use this OR super not both in the
		 * constructor..
		 */
		
		this("(2) Invoke Employee's overloaded constructor");
		//From here jump down to the other constructor in employee
		
		//Continue from the other Employee Constructor.
		System.out.println("(3) Performs Employee's tasks");
		
		//Jump back to Faculty
	}

	public Employee(String s) {
		/* Since Employee extends Person, java will automatically
		 * call the super() constructor of the Person class.
		 */
		
		//Jump over to Person from here
		
		//Come back to here from Person.
		System.out.println(s);
		
		//Go back to the other constructor of Employee
	}
}