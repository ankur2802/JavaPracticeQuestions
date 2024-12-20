package com.practice.math;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you number");
		int n = sc.nextInt();
		int ld=0;
		int rev=0;
		
		while(n>0) {
			ld=n%10;
			rev=rev*10+ld;
			
			n=n/10;
		}
		System.out.println(rev);
	
		
	}

}
