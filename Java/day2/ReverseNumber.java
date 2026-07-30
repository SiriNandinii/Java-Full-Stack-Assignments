package day2;
import java.util.Scanner;
/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 8:55:07 PM
* Email : sirinandini.a@gmail.com
*/

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("The reversed number is " + reverse + ".");

        sc.close();
    }
}