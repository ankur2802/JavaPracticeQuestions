package com.practice.math;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        int temp1=n;
        int ld=0;
        int temp=0;

        
        while(n>0) {
        	ld=n%10;
        	temp=temp*10+ld;
        	n=n/10;
        }
       if(temp==temp1) {
    	   System.out.println("no is palindrome");
       }
       else
    	   System.out.println("no is not palindrome");
        
	}

}
