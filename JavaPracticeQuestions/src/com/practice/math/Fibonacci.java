package com.practice.math;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();

       int n3=0;

        
     
        	int num1 = 0, num2 = 1;

            for (int i = 0; i < n; i++) {
                // Print the number
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;  
            
                   
        }
		
		
	}
	
}
