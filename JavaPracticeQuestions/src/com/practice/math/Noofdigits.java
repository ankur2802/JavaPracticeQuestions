package com.practice.math;

import java.util.Scanner;

public class Noofdigits {
public static void main1(String args[]) {
	System.out.println("hi 1");
	}

public static void main2(String args[]) {
	System.out.println("hi 2");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you number");
		int n = sc.nextInt();
		
		int count=0;
		
		  while (n != 0) {
	          
	            
	            n = n / 10;
	          
	            ++count;
		  }
		System.out.println(count);
		
	}
}

