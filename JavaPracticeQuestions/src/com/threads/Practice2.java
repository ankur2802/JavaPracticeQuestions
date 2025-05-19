package com.threads;

public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj1= new C();
		D obj2 = new D();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
}




}



class C implements Runnable{
public void run() {
	for(int i=0;i<40;i++) {
		System.out.println("hello "+i);
	}
}
}

class D implements Runnable{
public void run() {
	for(int i=0;i<40;i++) {
		System.out.println("hi "+i);
	}
}
}



