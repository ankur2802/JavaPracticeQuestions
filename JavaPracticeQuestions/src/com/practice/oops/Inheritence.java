package com.practice.oops;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj = new Calc();
		Calc obj1 = new AdvCalc();
		obj.add();
		obj1.add();
		
		
	}
}
	

	class Calc{
		
		int a=10;
		int b=5;
		void add() {
			System.out.println(a+b);
		}
		void sub() {
			System.out.println(a-b);
		}
		
	}



class AdvCalc extends Calc{
	
	void add() {
		System.out.println(a+b+2);
	}
}






