package com.practice.oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		dog.name = "Bull dog";
		dog.sound();
		
	}

}

class Animal{
	String name; //Property
	
	void sound() {  //Behaviour
		System.out.println("ANimal makes a sound");
	}
	
}