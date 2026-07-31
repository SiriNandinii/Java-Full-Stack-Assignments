package day3;
import java.util.Scanner;
/**
* Author : sirin
* Date : Jul 10, 2026
* Time : 9:05:02 PM
* Email : sirinandini.a@gmail.com
*/


public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Student 1
        System.out.println("Enter details of Student 1");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Year of Joining: ");
        int year1 = sc.nextInt();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address: ");
        String address1 = sc.nextLine();
        s1.getInfo(name1, year1, salary1, address1);

        // Student 2
        System.out.println("\nEnter details of Student 2");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Year of Joining: ");
        int year2 = sc.nextInt();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address: ");
        String address2 = sc.nextLine();
        s2.getInfo(name2, year2, salary2, address2);

        // Student 3
        System.out.println("\nEnter details of Student 3");
        System.out.print("Name: ");
        String name3 = sc.nextLine();
        System.out.print("Year of Joining: ");
        int year3 = sc.nextInt();
        System.out.print("Salary: ");
        double salary3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address: ");
        String address3 = sc.nextLine();
        s3.getInfo(name3, year3, salary3, address3);

        // Display Output
        System.out.println("\nName\t\tYear of Joining\t\tAddress");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        sc.close();
    }
}