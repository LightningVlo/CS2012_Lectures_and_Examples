package lec04.people;

public class Faculty extends Employee {
	//Program starting point
	public static void main(String[] args) {
		new Faculty(); //Jump down to the Faculty constructor below
	}

	public Faculty() {
		/*Remember!!!! even though we might not have written super();
		 * the compiler will automatically insert super() to call the 
		 * no-arg constructor of Employee since Faculty extends Employee.
		 */
		
		//Jump back to the Employee class at this point.
		
		//Jump here from Employee
		
		System.out.println("(4) Performs Faculty's tasks");
		
		//Finally finish constructing our entire inheritance chain.
	}
}



