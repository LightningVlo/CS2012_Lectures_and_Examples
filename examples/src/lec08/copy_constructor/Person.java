package lec08.copy_constructor;

public class Person {
	private String name;
	private int idNum;
	private Birthday bday;
	
	public Person(String name, int idNum, Birthday bday) {
		this.name = name;
		this.idNum = idNum;
		this.bday = bday;
	}
	
	//Copy Constructor
	public Person(Person p) {
		//Note you can use either method here to make a copy
		//this(p.name, p.idNum, new Birthday(p.bday));
		//or
		
		this.name = p.name;
		this.idNum = p.idNum;
		this.bday = new Birthday(p.bday);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String toString() {
		return "Name: " + this.name + "\n" + "ID: " + this.idNum + "\n" + this.bday;
	}

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
	}	
}