
/*
******  
****  
***  
**  
*  */





package com.practice.pattern;

import java.util.Scanner;

public class ReverseTrianglePattern {

	public static void main(String args[]) {
		
		System.out.println("enter the no of rows");
		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		for(int i=a;i>=0;i--) {
			
			for(int j=i;j>=0;j--) {
				
			
			System.out.print("*");
			}
			System.out.println();
		}
		

	}
	
}
