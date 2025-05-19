package com.practice.arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of array");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements in array");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter number to be searched in array");
		int num=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				System.out.println("number has found in array");

				break;
			}
			else
				System.out.println(" number not found");

		}
		
	}


}




