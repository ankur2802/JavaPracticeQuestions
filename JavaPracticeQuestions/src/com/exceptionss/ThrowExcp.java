package com.exceptionss;

public class ThrowExcp {

    public static void main(String[] args) {

        int i = 0;
        int j = 18;
        int arr[] = {1, 2, 3, 4, 5};

        try {
            j = 18 / i;  // This will cause ArithmeticException
            System.out.println(arr.length);
            System.out.println(arr[4]); // This is fine (index 4 exists)
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
        catch (Exception e) {
            System.out.println("Some other exception: " + e);
        }

        // Now throwing an exception explicitly
        if (j == 0) {
            try {
                throw new ArithmeticException("Manual throw");
            } catch (ArithmeticException f) {
                System.out.println("Exception found: " + f);
            }
        }

        System.out.println("After try-catch, j = " + j);
    }
}
