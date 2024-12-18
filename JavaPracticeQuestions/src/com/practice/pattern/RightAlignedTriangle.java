package com.practice.pattern;

import java.util.Scanner;

public class RightAlignedTriangle {

	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows");
		int a = sc.nextInt();
		
		
		for(int i=1;i<=a;i++) {
			//for space
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			
			
			//for star
			for(int k=1;k<=i;k++) {
				System.out.print("*");

			}
			System.out.println();

		}
		
	}
}
