package com.practice.math;

import java.util.Scanner;

public class Productofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you number");
		int n = sc.nextInt();
		int ld=0;
		int mul=1;
		
		while(n!=0) {
			ld=n%10;
			mul=mul*ld;
			n=n/10;
		}
		System.out.println(mul);

	}

}
