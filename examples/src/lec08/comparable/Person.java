package lec08.comparable;

public class Person implements Comparable<Person>{
	private int age;
	private String firstName;

	public Person(String firstName, int age) {
		super();
		this.age = age;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + "]";
	}


	public int compareTo(Person o) {
		if (this.age == o.age) {
			return 0;
		}
		else if (this.age > o.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
