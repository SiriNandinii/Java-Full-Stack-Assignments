package day1;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 12:41:30 PM
 * Email : sirinandini.a@gmail.com
 */

public class CalculateBMI {

	public static void main(String[] args) {
		/*Write a Java program that asks the user to enter their weight in kilograms and height in meters, then calculates and prints their Body Mass Index (BMI). Use the formula BMI = weight / (height * height). */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weight (kg) : ");
		float w = sc.nextFloat();
		
		System.out.print("Enter Height (m) : ");
		float h = sc.nextFloat();
		
		float bmi = w / (h*h);
		System.out.println("Your BMI is : "+bmi);
	
		
		sc.close();
	}

}
