package day2;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 8:56:53 PM
* Email : sirinandini.a@gmail.com
*/

public class SumOfDigits {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("The sum of the digits is " + sum + ".");

        sc.close();
    }
}