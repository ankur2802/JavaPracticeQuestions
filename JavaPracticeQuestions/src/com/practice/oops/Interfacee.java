package com.practice.oops;

public class Interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//functional interface
//		C obj = new C(){
//			       public void show() {
//			    	   System.out.println("in a showwwww");
//			       }
//		             };
//		obj.show();
	
		
		C obj = ()-> 
		{
			System.out.println("in AA showwwww");
		};
		obj.show();
	}

}

interface C{
	
	void show();
	//void config();
}

//class D implements C{
	
//	
//	public void show() {
//		System.out.println("in a show");
//	}
//	public void config() {
//		System.out.println("in a config");
//
//	}
//}