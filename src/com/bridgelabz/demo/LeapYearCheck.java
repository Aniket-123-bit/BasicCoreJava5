package com.bridgelabz.demo;
import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String args[]) {
		int year;
		System.out.println("Enter a year:");
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
			// year is divisible by 4 but not 100, DISPLAY "leap year"
			// year is divisible by 400, DISPLAY "leap year"
		}
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(" year is a leap year");
	      else
	         System.out.println(" year is not a leap year");
	   }
		
		
}
