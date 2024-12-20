	/**
	 * Question: Print a full pyramid of stars:
	 *     *
	 *    ***
	 *   *****
	 *  *******
	 * *********
	 */

package com.practice.pattern;

import java.util.Scanner;

public class PyramidPattern {
	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("enter the no of rows");
	        int rows =sc.nextInt(); // Number of rows for the pyramid

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}
