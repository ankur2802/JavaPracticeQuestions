package com.threads;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1= new A();
		B obj2 = new B();
		
		obj1.run();
		obj2.run();
		
//		obj1.start();
//		obj2.start();
	}

}

class A extends Thread{
	public void run() {
		for(int i=0;i<40;i++) {
			System.out.println("hello "+i);
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<40;i++) {
			System.out.println("hi "+i);
		}
	}
}
