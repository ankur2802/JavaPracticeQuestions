package com.practice.math;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you number");
		int n = sc.nextInt();
		int ld=0;
		int mul=1;
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			
			mul=mul*i;
			
		}
		System.out.println();
		System.out.println(mul);
	}

}
