package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {222,4,2,3,99,77,67};
		
		//ascending order
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j] >arr[j+1]) {
					//swap
					temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
