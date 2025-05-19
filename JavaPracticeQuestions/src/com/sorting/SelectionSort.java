package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] arr = {222,4,2,3,99,77,67};
		
		//ascending order
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			int minpos=i;
			for(int j=i+1;j<arr.length;j++) {
		       if(arr[minpos]>arr[j]) {
		    	   minpos=j;
		       }
				
	}
			//swap
			 temp=arr[minpos];
			arr[minpos]=arr[i];
			arr[i]=temp;
			
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
