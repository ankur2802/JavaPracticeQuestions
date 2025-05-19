package com.exceptionss;

import java.util.Scanner;

public class CustomExcp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try {
            checkMarks(marks);
        } catch (LowMarksExcp e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }

	

		    public static void checkMarks(int marks) throws LowMarksExcp {
		        if (marks < 35) {
		            throw new LowMarksExcp("Marks too low, student has failed.");
		        } else {
		            System.out.println("Marks are sufficient, student has passed.");
		        }
		    
		
		
	

}
}


class LowMarksExcp extends Exception{
	
	public LowMarksExcp(String msg) {
		super(msg);
	}
}
	
