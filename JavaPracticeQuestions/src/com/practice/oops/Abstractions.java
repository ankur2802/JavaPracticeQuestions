package com.practice.oops;

public class Abstractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new B();
		obj.showA();
		

	}
	
}


abstract class A{
	public abstract void showA();

}

class B extends A{
	public void showA() {
		System.out.println("in A show");	}
}