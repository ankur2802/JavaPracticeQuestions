package com.practice.arrays;

import java.util.Scanner;

public class BinarySearch {

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

class Demo{
	
	int Searcher(int arr[], int key) {
		int mid= arr.length/2;
		int left=arr[0];
		int right=arr[arr.length-1];
		
		while(left<=right) {
			if(key==arr[mid]) {
				System.out.println("key has found");
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else if(key>arr[mid]) {
				left=mid+1;
			}
		}
		return -1;
	}
	
}


