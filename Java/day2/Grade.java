package day2;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 8:49:25 PM
* Email : sirinandini.a@gmail.com
*/

public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = sc.nextInt();

        
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A.");
        } 
        else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is B.");
        } 
        else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is C.");
        } 
        else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is D.");
        } 
        else if (score >= 0 && score <= 59) {
            System.out.println("Your grade is F.");
        } 
        else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }

        sc.close();
    }
}