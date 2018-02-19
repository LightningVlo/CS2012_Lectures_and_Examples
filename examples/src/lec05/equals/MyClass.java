package lec05.equals;

public class MyClass {
	int x;
	int y;
	
	
	public MyClass() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		MyClass mc = (MyClass)obj;
	
		if (this.x == mc.x && this.y == mc.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
