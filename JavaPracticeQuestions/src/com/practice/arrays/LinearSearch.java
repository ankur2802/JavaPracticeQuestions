package com.practice.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter the no to be searched");
		Scanner sc= new Scanner(System.in);
		int key=sc.nextInt();
		System.out.println("enter the size of the array");
		int n= sc.nextInt();
		System.out.println("enter the values of the array");
		int arr[] = new int[n];
		for(int i=0; i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}

		
		Searcher obj= new Searcher();
		obj.demo(arr, key);
	}

}

 class Searcher{
	
	 void demo(int arr[] , int key) {
		 for(int i=0;i<arr.length-1;i++) {
			 if(key==arr[i]) {
				 System.out.println(key+" has found at index "+ i);
			 }
			 
		 }
		 
		 
	 }
	 
}
