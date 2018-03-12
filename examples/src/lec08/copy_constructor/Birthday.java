package lec08.copy_constructor;

public class Birthday {
	public int month;
	public int day;
	public int year;
	
	public Birthday() {
		this.month = 1;
		this.day = 1;
		this.year = 1900;
	}
	
	public Birthday(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	//Birthday Copy Constructor
	public Birthday(Birthday b) {
		this(b.month, b.day, b.year);
		
//		this.month = b.month;
//		this.day = b.day;
//		this.year = b.year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String out = "";
		
		out += "Birthday: " + this.month + "/" + this.day + "/" + this.year;
		
		return out;
	}
}
