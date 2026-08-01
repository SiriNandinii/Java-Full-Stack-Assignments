package day1;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 11:54:17 AM
* Email : sirinandini.a@gmail.com
*/

// 1. Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		// Declaring Variables
		int a;
		int b;
		
		// Assignment
		a = 30;
		b = 20;
		
		System.out.println("Before Swapping ");
		System.out.println("a : "+a+" | b : "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping");
		System.out.println("a : "+a+" | b : "+b);
		
		
		
	}

}
