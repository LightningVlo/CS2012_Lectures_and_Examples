package lec05.equals;

public class MyClass {
	private int x;
	private int y;
	private String s;
	private int[] arr;
	
	
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
		MyClass mc = null;

		//Check to see if you can do the casting first.
		if (obj instanceof MyClass) {
			mc = (MyClass)obj;
		}
		else {
			return false;
		}

		boolean xyEqual = (this.x == mc.x && this.y == mc.y);

		if (!xyEqual) {
			return false;
		}

		if (!this.s.equals(mc.s)) {
			return false;
		}

		if (this.arr.length != mc.arr.length) {
			return false;
		}

		for (int i = 0 ; i < this.arr.length && i < mc.arr.length ; i++)  {
			if (this.arr[i] != mc.arr[i]) {
				return false;
			}
		}

		return true;
	}
}
