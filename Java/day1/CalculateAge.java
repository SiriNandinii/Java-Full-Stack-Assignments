package day1;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 12:20:42 PM
* Email : sirinandini.a@gmail.com
*/

// 3. Write a Java program that asks the user to enter their birth year, then calculates and prints their current age. Assume the current year is 2024.
//Expected Output: If the user inputs "1990", the program should output: "You are 34 years old."


public class CalculateAge {
	public static void main(String[] args) {
		
		// Declaration of variables
		Scanner sc = new Scanner(System.in);
		int currYear = 2026;
		
		System.out.println("Enter your birth year : ");
		int birthYear = sc.nextInt();
		
		if (birthYear > currYear) {
			System.out.println("You haven't been born yet :(");
		}
		else {
			System.out.println("You are "+(currYear - birthYear)+" years old !");
		}
		
		sc.close();		
	}

}
