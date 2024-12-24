package com.practice.oops;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Demo d1=new Demo();
	String s=d1.name;
	int a =d1.age;
	System.out.println(s+a);
	d1.human();
	
	Counter obj1 = new Counter();
    Counter obj2 = new Counter();
    System.out.println("Total Count: " + Counter.count); // Output: Total Count: 2	
		
		
	}

}

class Demo{
	String name="ankur";  //Instance variable
	int age= 20;
	
	void human() {
		String name="sanjay";// local variable
		int age = 30;
		
		System.out.println(name + age);
	}
}




class Counter {
    static int count = 0; // Static variable (acts like a global variable)

    Counter() {
        count++;
    }
}

