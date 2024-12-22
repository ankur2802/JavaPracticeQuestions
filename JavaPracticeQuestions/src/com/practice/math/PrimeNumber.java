package com.practice.math;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();

        // Handle edge cases
        if (n <= 1) {
            System.out.println("Number is neither prime nor composite");
        } else if (n == 2) {
            System.out.println("Number is prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // No need to continue if a divisor is found
                }
            }

            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
    }
}
