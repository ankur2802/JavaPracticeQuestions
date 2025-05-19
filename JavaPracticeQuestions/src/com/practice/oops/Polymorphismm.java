package com.practice.oops;

public class Polymorphismm {
	
	public static void main(String args[]) {
		demo d = new demo2();
		d.add(1,3);
		
	}

}

class demo{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
}

class demo2 extends demo{
	void add(int a, int b) {
		System.out.println(a+b+2);

	}
}