package lec08.copy_constructor;

public class Tester {

	public static void main(String[] args) {
		Person p1 = new Person("John", 12345, new Birthday(10,27,2014));
		Person p2 = new Person("Sue", 5325, new Birthday(5, 10, 1986));

//		System.out.println(p1);
//		System.out.println(p2);
//		
//		System.out.println();
		
		Person p3 = new Person(p2);
		System.out.println(p2);
		System.out.println(p3);
		
		p3.getBday().year = 2000;
		
		
		System.out.println();
		
		System.out.println(p2);
		System.out.println(p3);
		
		


	}


}
