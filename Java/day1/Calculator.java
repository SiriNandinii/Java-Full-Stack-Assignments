package day1;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 12:03:39 PM
* Email : sirinandini.a@gmail.com
*/

// 2. Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division..

public class Calculator {
	
	public static void main(String[] args) {
		
		// Declaration
		float a;
		float b;
		int op;
		Scanner sc = new Scanner(System.in);
		

		
		System.out.print("Number 1 : ");
		a = sc.nextInt();
		
		System.out.print("Number 2 : ");
		b = sc.nextInt();
		
		
		System.out.println("Choose an option (1-4) : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		op = sc.nextInt();
		

		switch(op){
		
		case(1):
			System.out.println(a+b);
			break;
			
		case(2):
			System.out.println(a-b);
			break;
			
		case(3):
			System.out.println(a*b);
			break;
			
		case(4):
			if(b==0) {
				System.out.println("Zero Division Error.");
			}
			else {
				System.out.println(a/b);
			}
		default:
			System.out.println("Invalid. Please enter a Number between (1-4)");
		}
		
		
	
		
		
		
		
		sc.close();
	}

}
