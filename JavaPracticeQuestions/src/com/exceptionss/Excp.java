package com.exceptionss;

public class Excp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2;
		int j=18;
		int arr[]= {1,2,3,4,5};
		
		try {
			j=j/i;
			System.out.println(arr.length);
			System.out.println(arr[5]);
			
			
		}
		catch(Exception e){
			System.out.println("fetching values out of bound");
		}
		
		System.out.println("after try catch " + j);

		
	}

}
