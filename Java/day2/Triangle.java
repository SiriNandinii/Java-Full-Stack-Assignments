package day2;
import java.util.Scanner;
/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 8:52:01 PM
* Email : sirinandini.a@gmail.com
*/

public class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first side: ");
        int side1 = sc.nextInt();

        System.out.print("Enter the length of second side: ");
        int side2 = sc.nextInt();

        System.out.print("Enter the length of third side: ");
        int side3 = sc.nextInt();
        
        

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } 
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        }
        else {
            System.out.println("The triangle is scalene.");
        }

        sc.close();
    }
}