package lec08.comparable;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonSort {

	public static void main(String[] args) {
		Person[] p = new Person[10];
		
		
		p[0] = new Person("John", 25);
		p[1] = new Person("Sally", 21);
		p[2] = new Person("Alice", 40);
		p[3] = new Person("Alice", 40);
		p[4] = new Person("Alice", 40);
		p[5] = new Person("Kevin", 35);
		p[6] = new Person("Eric", 19);
		p[7] = new Person("alice", 40);
		p[8] = new Person("alice", 40);
		p[9] = new Person("alice", 40);
		
		System.out.println(p[0].compareTo(p[1]));
		
		for (Person x : p) {
			System.out.println(x);
		}
		
		System.out.println();
		
		Arrays.sort(p);
		
		for (Person x : p) {
			System.out.println(x);
		}
		
		
		
		
	}

}
