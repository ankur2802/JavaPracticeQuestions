/**
 * Question: Print a right-angled triangle of stars:
 * *
 * **
 * ***
 * ****
 * *****
 */





package com.practice.pattern;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int a= sc.nextInt();
		
		for(int i=1;i<a;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
