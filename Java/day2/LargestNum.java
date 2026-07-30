package day2;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 10, 2026
 * Time : 8:50:32 PM
 * Email : sirinandini.a@gmail.com
 */

public class LargestNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		
		

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("The largest number is " + num1 + ".");
		} 
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println("The largest number is " + num2 + ".");
		}
		else {
			System.out.println("The largest number is " + num3 + ".");
		}

		sc.close();
	}
}